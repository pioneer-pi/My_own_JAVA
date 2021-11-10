package com.controller;

import com.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private String BASE = "/WEB-INF/jsp/";
    private static Logger LOGGER = Logger.getLogger(LoginServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(BASE + "login.html").forward(request,response);
        LOGGER.info("We have dispatcher to /WEB-INF/jsp/login.html");
    }

    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("pwd");
        User user= null;
        String url;
        if ("pioneer".equals(userName) && "123456".equals(password)){
            user = new User(userName,password);
            request.getSession().setAttribute("user",user);
            url = "/welcome";
            LOGGER.info("The server have correct username and password,So we need to redirect to welcome!");
        }else{
            url = "/login";
            LOGGER.info("The server haven't correct username or password,So we need to redirect to login!");
        }
        response.sendRedirect(request.getContextPath() + url);
    }
}
