package com.example01;

import javax.crypto.spec.PSource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/example01/login")
public class LoginServlet extends HttpServlet {
    private static final String BASE = "/html/Servlet_html/";
    private static final Logger LOGGER =
            Logger.getLogger(LoginServlet.class.getName());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("用户名: "+ req.getParameter("username"));
        LOGGER.info("密码: "+req.getParameter("pwd"));
        String userName = req.getParameter("username");
        String password = req.getParameter("pwd");
        String url;
//        if (user != null){
//            req.getSession().setAttribute("user",user);
//            url = "/html/Servlet_html/Welcome.html";
//        }else{
//            url = "/html/Servlet_html/LoginServlet.html";
//        }
//        resp.sendRedirect(req.getContextPath() + url);
    }
}
