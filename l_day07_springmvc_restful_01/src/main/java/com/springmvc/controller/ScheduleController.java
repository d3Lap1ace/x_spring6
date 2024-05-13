package com.springmvc.controller;


import com.springmvc.pojo.Schedule;
import com.springmvc.service.ScheduleService;
import com.springmvc.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname x_spring6
 * @Auther d3Lap1ace
 * @Time 13/5/2024 11:42 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */
@CrossOrigin
@RestController
@RequestMapping("schedule")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public R showAllPage(){
        List<Schedule> list = scheduleService.getAll();
        return R.ok(list);
    }

    @DeleteMapping("{id}")
    public R deleteSchedule(@PathVariable Integer id){
        scheduleService.removeById(id);
        return R.ok(null);
    }

    @PostMapping
    public R saveSchedule(@RequestBody Schedule schedule){
        scheduleService.saveSchedule(schedule);
        return R.ok(schedule);
    }
    @PutMapping
    public R chagesSchedule(@RequestBody Schedule schedule){
        scheduleService.updateSchedule(schedule);
        return R.ok(null);
    }
}
