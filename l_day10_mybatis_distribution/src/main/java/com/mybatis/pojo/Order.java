package com.mybatis.pojo;

import lombok.Data;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 15:26 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class Order {
    private Integer orderId;
    private String orderName;

    private Integer customerId;
    private Customer customer;


}
