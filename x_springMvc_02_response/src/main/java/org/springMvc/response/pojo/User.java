package org.springMvc.response.pojo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 5/24/2024 11:08 PM Fri
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class User {
    private String name;
    private Integer age;
    private String hooby;
}
