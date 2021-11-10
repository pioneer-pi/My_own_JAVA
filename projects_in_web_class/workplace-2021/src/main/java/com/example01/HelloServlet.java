package com.example01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/helloservlet")
public class HelloServlet extends HttpServlet {
    private static final Logger LOGGER =
            Logger.getLogger(HelloServlet.class.getName());
    public HelloServlet(){
        LOGGER.info("HelloServlet()");
    }
    @Override
    public void init() throws ServletException{
        super.init();
        LOGGER.info("init()");
    }
    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LOGGER.info("service()");
        super.service(req,resp);
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        LOGGER.info("doGet()");
        response.getWriter().println("Hello Servlet");

        request.setAttribute("requestScope","request级作用域");
        HttpSession session = request.getSession();
        session.setAttribute("sessionScope","session会话级作用域");
        ServletContext context = request.getServletContext();
        context.setAttribute("contextScope","application应用级作用域");

        LOGGER.info("第一次请求: " + (String) request.getAttribute("requestScope"));
        LOGGER.info("第一次请求: " + (String) request.getSession().getAttribute("sessionScope"));
        LOGGER.info("第一次请求: " + (String) request.getServletContext().getAttribute("contextScope"));
    }

}
