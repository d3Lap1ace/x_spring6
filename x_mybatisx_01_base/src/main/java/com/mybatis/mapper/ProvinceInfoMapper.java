package com.mybatis.mapper;

import com.mybatis.pojo.ProvinceInfo;

/**
* @author d3lap1ace
* @description 针对表【province_info】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.ProvinceInfo
*/
public interface ProvinceInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ProvinceInfo record);

    int insertSelective(ProvinceInfo record);

    ProvinceInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProvinceInfo record);

    int updateByPrimaryKey(ProvinceInfo record);

}
