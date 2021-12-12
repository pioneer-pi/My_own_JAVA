package com.group820.demos.servlet.admin;

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

@WebServlet("/admin/query")
public class QueryServlet extends HttpServlet {
    private GoodsService goodsService = ServiceFactory.getGoodsService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*
        一旦Gid没输入就会报错 空字符串无法转int
         */
        String Gid = req.getParameter("Gid");
        String Gname = req.getParameter("Gname");
        String Gtype = req.getParameter("Gtype");
        System.out.println("Gid= " + Gid);
        System.out.println("Gname= " + Gname);
        System.out.println("Gtype= " + Gtype);
        List<Goods> goods = goodsService.queryGoods(Gid,Gname,Gtype);
        req.setAttribute("goods", goods);
        req.getRequestDispatcher("/WEB-INF/admin_jsp/admin.jsp").forward(req, resp);
    }
}
