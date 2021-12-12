package com.group820.demos.servlet;

import com.group820.demos.entity.User;
import com.group820.demos.service.GoodsService;
import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet  extends HttpServlet {



    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminName = request.getParameter("adminName");
        String password = request.getParameter("password");
        String url = "";

        if ("820".equals(adminName) && "123456".equals(password)){
            User user = new User();
            user.setUsername(adminName);
            user.setPassword(password);

            request.getSession().setAttribute("user",user);
            url = "/admin/welcome";
        }
        else{
            url = "/index";
        }
        response.sendRedirect(request.getContextPath()+url);
    }
}
