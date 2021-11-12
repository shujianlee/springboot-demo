package com.example.demo3.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @package: com.example.demo3.handler
 * @ClassName: CustomExtHandler
 * @author: james
 * @date: 2021-07-28 16:52
 * @version: V1.0.1
 * @description: 异常处理类
 */
//@RestControllerAdvice
@ControllerAdvice
public class CustomExtHandler {

//    @ExceptionHandler(value = Exception.class)
//    public JSONData handlerException(Exception e, HttpServletRequest request){
//        return JSONData.buildFail(-2, "服务器异常！");
//    }

    @ExceptionHandler(value = Exception.class)
    public Object handlerException(Exception e, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error.html");
        System.out.println(e.getMessage());
        e.printStackTrace();
        modelAndView.addObject("msg", e.getMessage());
        return modelAndView;
    }
}