package com.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName district_info
 */
@Data
public class DistrictInfo implements Serializable {
    private Integer id;

    private String name;

    private Integer cityId;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}