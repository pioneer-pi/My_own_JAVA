package com.group820.demos.servlet.admin;

import com.group820.demos.entity.Goods;
import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/findone")
public class FindOneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int gid = Integer.parseInt(req.getParameter("Gid"));
        Goods goods = ServiceFactory.getGoodsService().listGoodsByGid(gid);
        req.setAttribute("goods", goods);
        req.getRequestDispatcher("/WEB-INF/admin_jsp/update.jsp").forward(req, resp);
    }
}
