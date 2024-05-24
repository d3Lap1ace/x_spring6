package com.springMvc.recetion;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/23/2024 8:17 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    private ServletContext application;

    @RequestMapping("shoudong/{id}")
    public void shoudong(HttpSession session,
                         String name,
                         HttpServletResponse resp,
                         @PathVariable Integer id,
                         HttpServletRequest req) throws IOException {
        session.setAttribute("name",name);

        ServletContext servletContext = req.getServletContext();
        ServletContext servletContext1 = session.getServletContext();

        System.out.println("servletContext1 = " + servletContext1);
        System.out.println("servletContext = " + servletContext);

        String method = req.getMethod();
        System.out.println("method = " + method);
        resp.getWriter().print("hello springMvc!");
    }
    @RequestMapping("share")
    public String share(HttpSession session,
                        HttpServletRequest req){
        application.setAttribute("key","value");
        System.out.println("application = " + application);
        session.setAttribute("key","value");
        System.out.println("session = " + session);
        req.setAttribute("key","value");
        System.out.println("req = " + req);
        return "xx";
    }
}
