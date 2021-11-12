package com.example.demo3.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @package: com.example.demo3.servlet
 * @ClassName: UserServlet
 * @author: james
 * @date: 2021-07-28 21:48
 * @version: V1.0.1
 * @description:
 */
@WebServlet(name = "userServlet", urlPatterns = "/api/v1/pub/user/servlet")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("this is userServlet print");
        writer.write("this is userServlet ");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req, resp);
    }
}
