package com.java.pojo;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 15:17 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Employee {
    private Integer empId;

    private String empName;

    private Double empSalary;


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }
}
