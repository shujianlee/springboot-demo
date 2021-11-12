package com.example.demo3.intercepter;

import com.example.demo3.domain.User;
import com.example.demo3.service.impl.UserServiceImpl;
import com.example.demo3.util.JSONData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @package: com.example.demo3.intercepter
 * @ClassName: LoginIntercepter
 * @author: james
 * @date: 2021-07-29 0:19
 * @version: V1.0.1
 * @description:
 */
public class LoginIntercepter implements HandlerInterceptor {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginIntercepter  preHandle");

        String token = request.getHeader("token");
        if (StringUtils.isEmpty(token)){
            request.getParameter("token");
        }
        if (StringUtils.isEmpty(token)){
            String s = objectMapper.writeValueAsString(JSONData.buildFail(-2, "请先登录！"));
            renderJson(response, s);
            return false;
        } else {
            //判断token是否合法
            User user = UserServiceImpl.sessionMap.get(token);
            if (user != null){
                return true;
            }else {
                String s = objectMapper.writeValueAsString(JSONData.buildFail(-2, "登录已失效，请重新登录！"));
                renderJson(response, s);
                return false;
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
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle  preHandle");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion  preHandle");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
