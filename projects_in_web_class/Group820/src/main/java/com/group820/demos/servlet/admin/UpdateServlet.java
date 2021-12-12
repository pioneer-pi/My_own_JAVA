package com.group820.demos.servlet.admin;

import com.group820.demos.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/update")
public class UpdateServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Gid = Integer.parseInt(req.getParameter("Gid"));
        String Gname = req.getParameter("Gname");
        int Gprice = Integer.parseInt(req.getParameter("Gprice"));
        String Gtype = req.getParameter("Gtype");
        int Gdelete = Integer.parseInt(req.getParameter("Gdelete"));
        String Gintroduce = req.getParameter("Gintroduce");
        int flag = ServiceFactory.getGoodsService().updateGoods(Gid, Gname, Gprice, Gtype, Gdelete,Gintroduce);
        req.getRequestDispatcher("/admin/welcome").forward(req, resp);

    }
}
