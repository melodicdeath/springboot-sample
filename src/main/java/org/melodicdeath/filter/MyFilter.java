package org.melodicdeath.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by zt on 17/5/17.
 */
@WebFilter(filterName="myFilter",urlPatterns="/xs")
public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("***filter init***");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("***filter doFilter***");
    }

    @Override
    public void destroy() {
        System.out.println("***filter destroy***");
    }
}
