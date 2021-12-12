package com.group820.demos.servlet.admin;

import com.group820.demos.entity.User;
import com.group820.demos.service.GoodsService;
import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/welcome")
public class WelcomeServlet extends HttpServlet {
    private GoodsService goodsService = ServiceFactory.getGoodsService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("goods",goodsService.listGoods());
        request.getRequestDispatcher("/WEB-INF/admin_jsp/admin.jsp").forward(request,response);
    }
}
