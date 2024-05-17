package com.mybatis.mapper;

import com.mybatis.pojo.Order;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 14/5/2024 18:26 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface OrderMapper {
    List<Order> queryAllCustomer();
}
