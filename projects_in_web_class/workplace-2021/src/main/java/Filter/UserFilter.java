package Filter;

import com.example04.User;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebFilter("/filter/*")
public class UserFilter extends HttpFilter {
    private final List<String> excludes = List.of("/filter/login");
    @Override
    protected void doFilter(HttpServletRequest request,
                            HttpServletResponse response,
                            FilterChain chain) throws ServletException, IOException {
        for (String e : excludes){
            if (e.equals(request.getServletPath())){
                chain.doFilter(request,response);
                return;
            }
        }
        User user = (User) request.getSession().getAttribute("user");
        if (user != null){
            chain.doFilter(request,response);
        }else{
            response.sendRedirect(request.getContextPath() + "/filter/login");
        }
    }
}
