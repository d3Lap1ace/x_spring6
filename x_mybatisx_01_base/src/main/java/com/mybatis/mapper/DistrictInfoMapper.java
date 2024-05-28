package com.mybatis.mapper;

import com.mybatis.pojo.DistrictInfo;

/**
* @author d3lap1ace
* @description 针对表【district_info】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.DistrictInfo
*/
public interface DistrictInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(DistrictInfo record);

    int insertSelective(DistrictInfo record);

    DistrictInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DistrictInfo record);

    int updateByPrimaryKey(DistrictInfo record);

}
