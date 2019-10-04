package com.yy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("DemoServlet.service");
        System.out.println("---------------------");
        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
        System.out.println("test for git");
        System.out.println("test for git2");
        System.out.println("test for git2");
        System.out.println("test for webdemo2...");
        System.out.println("test for git update by dev 01");

    }

    public void test(){
        int i=0;
        i++;
        System.out.println("dev......");
    }

}
