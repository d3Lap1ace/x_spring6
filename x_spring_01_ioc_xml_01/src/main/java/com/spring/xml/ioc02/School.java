package com.spring.xml.ioc02;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 23/5/2024 14:42 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class School {
    private String name;
    private String address;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public School(){};

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
