package com.group820.demos.servlet;

import com.group820.demos.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/judge")
public class judge extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        if (user != null) {
            req.getRequestDispatcher("/admin/welcome").forward(req, resp);
        }
        else {
            req.getRequestDispatcher("/jsp/login.jsp").forward(req, resp);
        }
    }
}
