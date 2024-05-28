package com.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName user_info
 */
@Data
public class UserInfo implements Serializable {
    private Long id;

    private String phone;

    private String password;

    private String avatarUrl;

    private String nickname;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}