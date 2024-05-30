package com.impower.mybatisx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.impower.mybatisx.pojo.User;


/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 08:55 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public interface UserMapper extends BaseMapper<User> {
    IPage<User> getPageList(Page<User> page, User user);
}
