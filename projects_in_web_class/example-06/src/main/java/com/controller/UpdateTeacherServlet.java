package com.controller;

import com.util.DatabaseUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateteachers")
public class UpdateTeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int teacherId = Integer.parseInt(request.getParameter("tid"));
        request.setAttribute("teacher", DatabaseUtils.getTeacher(teacherId));
        request.setAttribute("titles",DatabaseUtils.listTitles());
        request.setAttribute("courses",DatabaseUtils.listCourses());
        request.getRequestDispatcher("/WEB-INF/JSP/updateteacher.jsp")
                .forward(request,response);
    }
}
