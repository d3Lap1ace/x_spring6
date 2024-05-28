package com.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName label_info
 */
@Data
public class LabelInfo implements Serializable {
    private Long id;

    private Integer type;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}