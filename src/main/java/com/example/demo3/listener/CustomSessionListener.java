package com.example.demo3.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @package: com.example.demo3.listener
 * @ClassName: CustomSessionListener
 * @author: james
 * @date: 2021-07-28 22:15
 * @version: V1.0.1
 * @description:
 */
@WebListener
public class CustomSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated=============");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed=============");
    }
}
