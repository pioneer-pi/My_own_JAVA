package com.group820.demos.servlet.admin;

import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Gid = Integer.parseInt(req.getParameter("Gid"));
        int flag = ServiceFactory.getGoodsService().deleteGoodsByGid(Gid);
        req.getRequestDispatcher("/admin/welcome").forward(req, resp);
    }
}
