package com.springmvc.service;

import com.springmvc.pojo.Schedule;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 13/5/2024 11:33 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
public interface ScheduleService {
    /**
     * 返回全部学习计划
     * @return
     */
    List<Schedule> getAll();

    /**
     * 保存学习计划
     * @param schedule
     */
    void saveSchedule(Schedule schedule);

    /**
     * 更新学习计划
     * @param schedule
     */
    void updateSchedule(Schedule schedule);

    /**
     * 移除学习计划
     * @param
     */
    void removeById(Integer id);
}
