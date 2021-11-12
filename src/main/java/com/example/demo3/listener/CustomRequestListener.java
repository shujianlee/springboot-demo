package com.example.demo3.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @package: com.example.demo3.listener
 * @ClassName: CustomRequestListener
 * @author: james
 * @date: 2021-07-28 22:18
 * @version: V1.0.1
 * @description:
 */
@WebListener
public class CustomRequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("requestDestroyed=============");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized=============");
    }
}
