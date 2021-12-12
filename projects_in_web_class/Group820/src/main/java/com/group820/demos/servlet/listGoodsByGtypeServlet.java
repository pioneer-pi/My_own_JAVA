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
import java.util.List;

@WebServlet("/listGoodsByGtype")
public class listGoodsByGtypeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Gtype = request.getParameter("Gtype");
        GoodsService goodsService = ServiceFactory.getGoodsService();
        List<Goods> goodsList = goodsService.listGoodsByGtype(Gtype);
        request.setAttribute("goods",goodsList);
        request.getRequestDispatcher("/jsp/listGoodsByGtype.jsp").forward(request,response);
    }
}
