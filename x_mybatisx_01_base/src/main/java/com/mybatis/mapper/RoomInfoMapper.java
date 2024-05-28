package com.mybatis.mapper;

import com.mybatis.pojo.RoomInfo;

/**
* @author d3lap1ace
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
* @createDate 2024-05-28 21:03:58
* @Entity com.mybatis.pojo.RoomInfo
*/
public interface RoomInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RoomInfo record);

    int insertSelective(RoomInfo record);

    RoomInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoomInfo record);

    int updateByPrimaryKey(RoomInfo record);

}
