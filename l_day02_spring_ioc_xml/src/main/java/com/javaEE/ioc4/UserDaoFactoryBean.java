package com.javaEE.ioc4;

import org.springframework.beans.factory.FactoryBean;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 15:26 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class UserDaoFactoryBean implements FactoryBean {

    private String ergouzi;

    public void setErgouzi(String config) {
        this.ergouzi = config;
    }

    /**
     * 放我们制造的对象的过程
     * @return 制造好的对象 返回ioc容器
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        UserDao userDao = new UserDao();
        userDao.setConfig(ergouzi);
        System.out.println("UserDaoFactoryBean.getObject");
        return userDao;
    }

    /**
     * 返回对象类型,不知道返回null
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /**
     * 制造对象的模式:单例|多例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
