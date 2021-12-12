package com.group820.demos.servlet.admin;

import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/addGoods")
public class AddGoodsServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Gid = Integer.parseInt(request.getParameter("Gid"));
        String Gname = request.getParameter("Gname");
        int Gprice = Integer.parseInt(request.getParameter("Gprice"));
        String Gtype = request.getParameter("Gtype");
        String Gintroduce =request.getParameter("Gintroduce");

        int flag = ServiceFactory.getGoodsService().addGoods(Gid,Gname,Gprice,Gtype,Gintroduce);

        request.getRequestDispatcher("/admin/welcome").forward(request,response);
    }
}
