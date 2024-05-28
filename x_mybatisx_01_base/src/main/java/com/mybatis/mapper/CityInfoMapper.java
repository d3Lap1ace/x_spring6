package com.mybatis.mapper;

import com.mybatis.pojo.CityInfo;

/**
* @author d3lap1ace
* @description 针对表【city_info】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.CityInfo
*/
public interface CityInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    CityInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);

}
