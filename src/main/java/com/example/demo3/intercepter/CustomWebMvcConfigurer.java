package com.example.demo3.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @package: com.example.demo3.intercepter
 * @ClassName: CustomWebMvcConfigurer
 * @author: james
 * @date: 2021-07-29 0:16
 * @version: V1.0.1
 * @description:拦截器配置类
 */
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/api/v1/pri/order/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public LoginIntercepter getLoginIntercepter(){
        return new LoginIntercepter();
    }
}
