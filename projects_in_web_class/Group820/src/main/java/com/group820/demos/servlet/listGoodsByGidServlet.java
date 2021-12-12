package com.group820.demos.servlet;

import com.group820.demos.entity.Goods;
import com.group820.demos.service.GoodsService;
import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/listGoodsByGid")
public class listGoodsByGidServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Gid = Integer.parseInt(request.getParameter("Gid"));
        GoodsService goodsService = ServiceFactory.getGoodsService();
        Goods goods = goodsService.listGoodsByGid(Gid);
        request.setAttribute("goods",goods);
        request.getRequestDispatcher("/jsp/listGoodsByGid.jsp").forward(request,response);
    }
}
