package com.example.demo.service.impl;

import com.example.demo.service.ScheduleJobService;
import com.example.demo.untils.ScheduleUtils;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ScheduleJobServiceImpl implements ScheduleJobService {


//    @Autowired(required = false)
//    private ScheduleJobMapper scheduleJobMapper;
//
//    @Autowired
//    private Scheduler scheduler;
//    /**
//     * 项目启动时，初始化定时器
//     */
//    @PostConstruct
//    public void init() {
//        ScheduleJobExample scheduleJobExample = new ScheduleJobExample();
//
//        List<ScheduleJob> scheduleJobList = scheduleJobMapper.selectByExample(scheduleJobExample);
//
//
//        for (ScheduleJob scheduleJob : scheduleJobList) {
//            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
////            如果不存在，则创建
//            if (cronTrigger == null) {
//                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
//            } else {
//                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
//            }
//        }
//    }
}
