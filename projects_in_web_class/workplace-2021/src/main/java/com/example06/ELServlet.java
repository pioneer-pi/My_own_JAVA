package com.example06;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example06/e1")
public class ELServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Address address = new Address("925");
        User user = new User("pioneer",address);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/WEB-INF/e1/index.jsp").forward(request,response);
    }
}
