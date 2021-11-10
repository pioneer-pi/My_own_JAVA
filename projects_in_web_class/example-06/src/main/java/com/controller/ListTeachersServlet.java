package com.controller;

import com.util.DatabaseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listteachers")
public class ListTeachersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("teachers", DatabaseUtils.listTeachers());
        request.getRequestDispatcher("/WEB-INF/JSP/listteachers.jsp")
                .forward(request,response);
    }
}
