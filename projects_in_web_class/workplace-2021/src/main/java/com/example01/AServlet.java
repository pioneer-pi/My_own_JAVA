package com.example01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

@WebServlet("/urlencoding")
public class AServlet extends HttpServlet {
    private static final Logger LOGGER =
            Logger.getLogger(AServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        String title = req.getParameter("title");
        LOGGER.info(title);
    }
}
