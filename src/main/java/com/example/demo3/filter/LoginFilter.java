package com.example.demo3.filter;

import com.example.demo3.domain.User;
import com.example.demo3.service.impl.UserServiceImpl;
import com.example.demo3.util.JSONData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.thymeleaf.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @package: com.example.demo3.filter
 * @ClassName: LoginFilter
 * @author: james
 * @date: 2021-07-28 20:35
 * @version: V1.0.1
 * @description: Created with IntelliJ IDEA
 */
//@WebFilter(urlPatterns = "/api/v1/pri/order/*", filterName = "LoginFilter")
public class LoginFilter implements Filter {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    /** 
     * @Description: 容器加载的时候
     * @Param: [filterConfig]
     * @return: void
     * @Author: james lee
     * @Date: 2021-07-28
     */ 
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init LoginFilter===================");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter LoginFilter===================");
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;
        String token = httpServletRequest.getHeader("token");
        if (StringUtils.isEmpty(token)){
            httpServletRequest.getParameter("token");
        }
        if (StringUtils.isEmpty(token)){
            String s = objectMapper.writeValueAsString(JSONData.buildFail(-2, "请先登录！"));
            renderJson(response, s);
        } else {
            //判断token是否合法
            User user = UserServiceImpl.sessionMap.get(token);
            if (user != null){
                chain.doFilter(request,response);
            }else {
                String s = objectMapper.writeValueAsString(JSONData.buildFail(-2, "登录已失效，请重新登录！"));
                renderJson(response, s);
            }
        }

    }

    public void renderJson(ServletResponse response, String json){
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        try {
            response.getWriter().print(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    /** 
     * @Description: 容器销毁的时候
     * @Param: []
     * @return: void
     * @Author: james lee
     * @Date: 2021-07-28
     */ 
    public void destroy() {
        System.out.println("destroy LoginFilter===================");
    }
}
