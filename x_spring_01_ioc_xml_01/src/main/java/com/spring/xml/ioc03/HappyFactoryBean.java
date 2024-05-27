package com.spring.xml.ioc03;

import org.springframework.beans.factory.FactoryBean;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 27/5/2024 09:01 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class HappyFactoryBean implements FactoryBean<HappyFactoryBean> {
    private String machineName;
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
    @Override
    public HappyFactoryBean getObject() throws Exception {
        HappyFactoryBean happyFactoryBean = new HappyFactoryBean();
        happyFactoryBean.setMachineName(this.machineName);
        return happyFactoryBean;
    }

    @Override
    public Class<?> getObjectType() {
        return HappyFactoryBean.class;
    }
}
