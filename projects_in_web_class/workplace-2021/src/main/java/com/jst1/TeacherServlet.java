package com.jst1;

import com.example06.Course;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/jst1/teacher")
public class TeacherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Course> courses = List.of(DatabaseUtils.getCourse(1),DatabaseUtils.getCourse(7));
        Teacher t = new Teacher(12,"王小明",DatabaseUtils.getTitle(2),courses);

        request.setAttribute("teacher",t);
        request.setAttribute("titles",DatabaseUtils.ListTitles());
        request.setAttribute("courses",DatabaseUtils.ListCourse());
        request.getRequestDispatcher("/WEB-INF/jst1/updateteacher.jsp")
                .forward(request,response);
    }
}
