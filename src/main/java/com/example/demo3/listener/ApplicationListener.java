package com.example.demo3.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @package: com.example.demo3.listener
 * @ClassName: ApplicationListener
 * @author: james
 * @date: 2021-07-28 22:10
 * @version: V1.0.1
 * @description:应用监听器，做初始化工作
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized=============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed===========");
    }
}
