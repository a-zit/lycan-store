/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
 * @author DEMO TEST
 */
public class LoginServlet extends HttpServlet {

    @PersistenceUnit(unitName = "LycanStorePU")
    EntityManagerFactory emf;
    
    @Resource
    UserTransaction utx;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        session.setAttribute("loginshow", "Login");
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null) {
            session.setAttribute("customer", customer);
            getServletContext().getRequestDispatcher("/ProductList").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        }
        session.setAttribute("loginalert", null);
        session.setAttribute("logoutshow", null);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        HttpSession session = request.getSession(true);
        
        if(username.trim().length()>0 && password.trim().length()>0){
            CustomerJpaController controller = new CustomerJpaController(utx, emf);
            Customer customer = controller.findCustomerUsername(username);
            if(customer!=null && password.equals(customer.getPassword())){
                session.setAttribute("customer", customer);
                session.setAttribute("logoutshow", "Logout");
                session.setAttribute("loginshow", null);
                getServletContext().getRequestDispatcher("/ProductList").forward(request, response);
            }
            else{
                session.setAttribute("loginalert", "Username or Password is Invalid");
                getServletContext().getRequestDispatcher("/Login").forward(request, response);
            }
        }else{
            session.setAttribute("loginalert", "Please Insert Username and Password");
            getServletContext().getRequestDispatcher("/Login").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
