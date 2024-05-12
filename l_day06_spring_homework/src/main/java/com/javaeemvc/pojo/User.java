package com.javaeemvc.pojo;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 12/5/2024 17:13 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class User {
    private Integer id;
    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
