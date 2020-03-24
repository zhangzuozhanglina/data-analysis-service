package com.metu.analyapploginauth.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName WebFilter
 * @Description 过滤器
 * @Author admin
 * @Date 2019/11/28 23:28
 * @Version 1.0
 **/
@Component
@javax.servlet.annotation.WebFilter(urlPatterns = "/*",filterName = "webfilter")
public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁了");
    }
}
