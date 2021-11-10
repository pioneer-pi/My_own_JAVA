package com.example04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/example04/welcome")
public class WelcomeServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(WelcomeServlet.class.getName());
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User)request.getSession().getAttribute("user");
        if (user!=null){
            request.getRequestDispatcher("/WEB-INF/example04/welcome.html")
                    .forward(request,response);
        }else{
            response.sendRedirect(request.getContextPath() + "/example04/login");
        }
    }
}
