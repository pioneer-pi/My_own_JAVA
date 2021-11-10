package com.controller;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private String BASE = "/WEB-INF/jsp/";
    private static Logger LOGGER = Logger.getLogger(WelcomeServlet.class.getName());
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(BASE + "welcome.html").forward(request,response);
    }
}
