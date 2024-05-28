package com.mybatis.mapper;

import com.mybatis.pojo.UserInfo;

/**
* @author d3lap1ace
* @description 针对表【user_info(用户信息表)】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.UserInfo
*/
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

}
