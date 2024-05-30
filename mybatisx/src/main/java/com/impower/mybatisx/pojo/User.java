package com.impower.mybatisx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 08:53 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "users")
public class User extends BaseEntity{

    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private Integer age;
    @TableField(value = "email")
    private String email;
}
