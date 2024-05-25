package com.springMvc.recetion;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/23/2024 8:07 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@RestController
@RequestMapping("cook")
public class CookController {
    @RequestMapping("save")
    public String save(HttpServletResponse response){
        Cookie cookie = new Cookie("name", "root");
        response.addCookie(cookie);
        return "cookies save!";
    }
    @RequestMapping("show")
    public String show(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String value = null;
        if(cookies != null){
            for (Cookie cookie : cookies) {
                if(cookie.getName().equals("name")){
                    value = cookie.getValue();
                }
            }
        }
        System.out.println("value = " + value);
        return "cookies show";
    }
    @RequestMapping("show1")
    public String show1(@CookieValue(name = "name")String name){
        System.out.println("CookController.show1");
        System.out.println("name = " + name);
        return "cookies show1";
    }

    @RequestMapping("show/{id}")
    public String show(@RequestHeader(name = "user-agent") String userAgent, @PathVariable Integer id){
        System.out.println("userAgent = " + userAgent);
        return "show";
    }


}
