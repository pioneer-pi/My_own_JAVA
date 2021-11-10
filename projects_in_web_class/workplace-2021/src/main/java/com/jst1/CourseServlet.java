package com.jst1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jst1/getcourse")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int courseId = Integer.parseInt(request.getParameter("cid"));
        request.setAttribute("course",DatabaseUtils.getCourse(courseId));
        request.getRequestDispatcher("/WEB-INF/jst1/getcourse.jsp").forward(request,response);
    }
}
