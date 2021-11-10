package Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        String path = context.getContextPath() + "/";
        System.out.println(path);
        context.setAttribute("basepath",path);
    }
}
