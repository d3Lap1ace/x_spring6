package org.springMvc.response.json;

import org.springMvc.response.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/24/2024 11:13 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Controller
@RequestMapping("json")
public class JsonController {


    @GetMapping("data")
    @ResponseBody
    public User data(){
        User user = new User();
        user.setName("maolizhi");
        user.setAge(20);
        user.setHooby("导管");
        return user;
    }

    @PostMapping("data1")
    @ResponseBody
    public User data1(@RequestBody User user){
        System.out.println("JsonController.data1");
        System.out.println("user = " + user);
        User user1 = new User();
        user1.setHooby("偷窥");
        user1.setAge(20);
        user1.setName("强哥");
        return user1;
    }
}
