package com.mybatis.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * @TableName room_info
 */
@Data
public class RoomInfo implements Serializable {
    private Long id;

    private String roomNumber;

    private BigDecimal rent;

    private Long apartmentId;

    private Integer isRelease;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}