package com.mybatis.mapper;

import com.mybatis.pojo.Customer;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 16/5/2024 15:45 周四
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface CustomerMapper {
    List<Customer>queryOrder(Integer id);
}
