package com.impower.mybatisx.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.impower.mybatisx.mapper.UserMapper;
import com.impower.mybatisx.pojo.User;
import com.impower.mybatisx.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 08:58 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
