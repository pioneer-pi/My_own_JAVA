package com.example01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

@WebServlet("/example01/register")
public class RegisterServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(RegisterServlet.class.getName());
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("pwd");
        String gender = request.getParameter("gender");
        String degree = request.getParameter("degree");
        String province = request.getParameter("province");
        String[] courses = request.getParameterValues("courses");
        LOGGER.info("name " + name);
        LOGGER.info("password " + password);
        LOGGER.info("gender_id " + gender);
        LOGGER.info("degree " + degree);
        LOGGER.info("province " + province);
    }
}
