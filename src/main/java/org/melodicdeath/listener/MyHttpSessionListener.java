package org.melodicdeath.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by zt on 17/5/17.
 */
@WebListener
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("[sessionCreated]");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("[sessionDestroyed]");
    }
}
