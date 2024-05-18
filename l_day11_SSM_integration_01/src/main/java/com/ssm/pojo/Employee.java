package com.ssm.pojo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 18/5/2024 14:49 周六
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class Employee {
    private Integer empId;
    private String empName;
    private Double empSalary;
}
