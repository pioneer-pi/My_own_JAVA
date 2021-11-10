package com.example02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example02/login2")
public class LoginServlet extends HttpServlet {
    private static final String BASE = "/WEB-INF/example03/";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(BASE + "login.html").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("pwd");
        String relUrl = "pioneer".equals(userName) && "123456".equals(password) ? "welcome.html" : "login.html";
        request.getRequestDispatcher(BASE + relUrl).forward(request,response);
    }
}
