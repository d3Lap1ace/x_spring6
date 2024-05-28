package com.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName apartment_info
 */
@Data
public class ApartmentInfo implements Serializable {
    private Long id;

    private String name;

    private String introduction;

    private Long districtId;

    private String districtName;

    private Long cityId;

    private String cityName;

    private Long provinceId;

    private String provinceName;

    private String addressDetail;

    private String latitude;

    private String longitude;

    private String phone;

    private Integer isRelease;

    private Date createTime;

    private Date updateTime;

    private Integer isDeleted;

    private static final long serialVersionUID = 1L;
}