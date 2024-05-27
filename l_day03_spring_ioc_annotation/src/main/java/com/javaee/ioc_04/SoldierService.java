package com.javaee.ioc_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @classname x_sprint6
 * @Auther d3Lap1ace
 * @Time 8/5/2024 19:24 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Service(value = "serviceDog")
public class SoldierService {

    @Autowired
    private SoldierDao soldierDao;
    public void getMessage(){
        soldierDao.getMessage();
    }
}
