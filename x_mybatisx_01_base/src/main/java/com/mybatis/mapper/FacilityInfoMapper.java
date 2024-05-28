package com.mybatis.mapper;

import com.mybatis.pojo.FacilityInfo;

/**
* @author d3lap1ace
* @description 针对表【facility_info(配套信息表)】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.FacilityInfo
*/
public interface FacilityInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(FacilityInfo record);

    int insertSelective(FacilityInfo record);

    FacilityInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FacilityInfo record);

    int updateByPrimaryKey(FacilityInfo record);

}
