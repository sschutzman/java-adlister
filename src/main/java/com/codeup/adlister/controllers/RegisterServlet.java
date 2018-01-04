package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/users/register.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String username = request.getParameter("username");
       String password = request.getParameter("password");
       String email = request.getParameter("email");
       String confirmPassword = request.getParameter("confirm_password");

        // TODO: ensure the submitted information is valid
        boolean inputHasErrors = username.isEmpty()
                || email.isEmpty()
                || password.isEmpty()
                || (!password.equals(confirmPassword));

        if (inputHasErrors){
            response.sendRedirect("/register");
        } else {
        // TODO: create a new user based off of the submitted information
            User user = new User(0, username, email, password);
            Long id = DaoFactory.getUsersDao().insert(user);
            user.setId(id);

        // TODO: if a user was successfully created, send them to their profile
        request.getSession().setAttribute("user", user);
        response.sendRedirect("/profile");
    }

    }
}
