package com.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName province_info
 */
@Data
public class ProvinceInfo implements Serializable {
    private Long id;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}