package com.example04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example04/login4")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/example04/login.html").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String userName = request.getParameter("username");
        String password = request.getParameter("pwd");
        User user = DatabaseUtils.getUser(userName,password);
        String url;
        if (user != null){
            request.getSession().setAttribute("user",user);
            url = "/example04/welcome";
        }else{
            url = "/example04/login4";
        }
        response.sendRedirect(request.getContextPath() + url);
    }
}
