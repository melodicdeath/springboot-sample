package org.melodicdeath.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by zt on 17/5/17.
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContex初始化");
        System.out.println(sce.getServletContext().getServerInfo());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContex销毁");
    }
}
