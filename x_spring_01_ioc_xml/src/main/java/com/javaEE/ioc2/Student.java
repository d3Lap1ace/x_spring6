package com.javaEE.ioc2;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/10/2024 7:20 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Student {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    public Student() {
        System.out.println("student的无参构造");
    }

    public Student(Integer id, String name, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
