/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import jpa.model.Customer;
import jpa.model.controller.CustomerJpaController;

/**
 *
 * @author Pluem
 */
public class RegisterServlet extends HttpServlet {

    @PersistenceUnit(unitName = "LycanStorePU")
    EntityManagerFactory emf;

    @Resource
    UserTransaction utx;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
        HttpSession session = request.getSession();
        session.setAttribute("registeralert", null);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String street = request.getParameter("street");
        String city = request.getParameter("city");
        String statefull = request.getParameter("statefull");
        String zipcode = request.getParameter("zipcode");
        String email = request.getParameter("email");
        String telno = request.getParameter("telno");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Customer customer = new Customer(fname, lname, street, city, statefull, zipcode, email, telno, username, password);
        CustomerJpaController controller = new CustomerJpaController(utx, emf);

        if (controller.findCustomerUsername(username) != null) {
            Customer customerformdb = controller.findCustomerUsername(username);
            if (customer.getUsername().equals(customerformdb.getUsername())) {
                session.setAttribute("registeralert", "Username already use, Please Change username");
                response.sendRedirect("Register");
            }
            if (customer.getMail().equals(customerformdb.getMail())) {
                session.setAttribute("registeralert", "Email already use, Please Change Email");
                response.sendRedirect("Register");
            }
        } else {
            try {
                controller.create(customer);
                session.setAttribute("customer", customer);
                session.setAttribute("registeralert", null);
                session.setAttribute("logoutshow", "Logout");

            } catch (Exception ex) {
                Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            getServletContext().getRequestDispatcher("/ProductList").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
