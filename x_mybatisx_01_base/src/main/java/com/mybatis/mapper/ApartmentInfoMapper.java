package com.mybatis.mapper;

import com.mybatis.pojo.ApartmentInfo;

/**
* @author d3lap1ace
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.ApartmentInfo
*/
public interface ApartmentInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ApartmentInfo record);

    int insertSelective(ApartmentInfo record);

    ApartmentInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApartmentInfo record);

    int updateByPrimaryKey(ApartmentInfo record);

}
