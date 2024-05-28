package com.mybatis.mapper;

import com.mybatis.pojo.LabelInfo;

/**
* @author d3lap1ace
* @description 针对表【label_info(标签信息表)】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.LabelInfo
*/
public interface LabelInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LabelInfo record);

    int insertSelective(LabelInfo record);

    LabelInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LabelInfo record);

    int updateByPrimaryKey(LabelInfo record);

}
