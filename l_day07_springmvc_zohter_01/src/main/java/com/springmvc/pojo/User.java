package com.springmvc.pojo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 13/5/2024 18:26 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class User {
    //账号不为null 不为空字符串
    @NotBlank
    private String account;


    @Length(min = 6)
    //长度大于等于6 []
    private String password;

    //大于等于18
    @Min(18) // 18 17 16 15 14
    private int age;

    @Past
    //必须是过去时间
    private Date birthday;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
