package com.impower.mybatisx.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 18:20 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class BaseEntity {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private Date updateTime;
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer isDeleted;
}
