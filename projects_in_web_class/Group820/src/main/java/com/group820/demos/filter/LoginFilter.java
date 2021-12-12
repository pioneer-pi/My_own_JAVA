package com.group820.demos.filter;

import com.group820.demos.entity.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/admin/*")
public class LoginFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
        User administrator = (User) request.getSession().getAttribute("user");
        if (administrator != null){
            chain.doFilter(request,response);
        }
        else{
            response.sendRedirect(request.getContextPath()+"/index");
        }
    }
}
