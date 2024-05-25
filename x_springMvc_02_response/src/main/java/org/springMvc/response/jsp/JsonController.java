package org.springMvc.response.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/24/2024 10:11 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
@RequestMapping("jsp")
public class JsonController {

    @GetMapping("index")
    public String jump(HttpServletRequest request){
        System.out.println("JsonController.jump");
        System.out.println("request = " + request);
        request.setAttribute("data","hello jsp");
        return "index";
    }

    @RequestMapping("redirect")
    public String redirectDemo(){
        return "redirect:http://www.bing.com";
    }
    @RequestMapping("forward")
    public String forwardDemo(){
        return "forward:/jsp/index";
    }

}
