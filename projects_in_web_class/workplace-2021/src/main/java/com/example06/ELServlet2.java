package com.example06;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/example06/e2")
public class ELServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User u1 = new User("BO");
        User u2 = new User("ZHANG");
        User u3 = new User("SUN");
        List<User> users = List.of(u1,u2,u3);
        request.setAttribute("users",users);
        request.getRequestDispatcher("/WEB-INF/jst1/index.jsp").forward(request,response);
    }
}
