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
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        Customer customer = new Customer( 
                request.getParameter("fname"), 
                request.getParameter("lname"), 
                request.getParameter("address"), 
                request.getParameter("email"), 
                request.getParameter("telno"), 
                request.getParameter("username"), 
                request.getParameter("password"));
        
        CustomerJpaController controller = new CustomerJpaController(utx, emf);
        
        try {
            controller.create(customer);
        } catch (Exception ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        getServletContext().getRequestDispatcher("/productlist.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
