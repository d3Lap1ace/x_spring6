package com.mybatisx.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/25/2024 9:12 PM Sat
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


@Data
public class User {
    private Integer uId;
    private String uName;
    private Integer uAge;
    private String uGender;
    private String uHooby;
}
