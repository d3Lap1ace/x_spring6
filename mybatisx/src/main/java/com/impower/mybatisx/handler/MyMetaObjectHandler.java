package com.impower.mybatisx.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @classname mybatisx
 * @Auther d3Lap1ace
 * @Time 29/5/2024 20:27 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //插入数据的时候给createTime填充值
        this.strictInsertFill(metaObject, "createTime", Date.class,new Date());
        //插入数据的时候给idDeleted填充值
        this.strictInsertFill(metaObject,"isDeleted",Integer.class,0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新的时候给updateTime填充值
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }
}
