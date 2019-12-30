package com.example.demo.untils;


/**
 * 定时任务工具类
 */
public class ScheduleUtils {

//    private final static String JOB_NAME = "TASK_";
//
//    public static void createScheduleJob(Scheduler scheduler, ScheduleJob scheduleJob) {
//        try {
//            //构建job信息
//            JobDetail jobDetail = JobBuilder.newJob(ScheduleJobUtils.class).withIdentity(getJobKey(scheduleJob.getJobId())).build();
//
//            //表达式调度构建器
//            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression()).withMisfireHandlingInstructionDoNothing();
//
//            //按新的cronExpression表达式构建一个新的trigger
//            CronTrigger trigger = TriggerBuilder.newTrigger().withIdentity(getTriggerKey(scheduleJob.getJobId())).withSchedule(cronScheduleBuilder).build();
//
//            //放入参数，运行时的方法可以获取
//            jobDetail.getJobDataMap().put("JOB_PARAM_KEY",scheduleJob);
//
//            scheduler.scheduleJob(jobDetail,trigger);
//
//            //暂停任务
//            if (scheduleJob.getStatus().equals("0")) {
//                pauseJob(scheduler, scheduleJob.getJobId());
//            }
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//            throw new RuntimeException("创建定时任务失败", e);
//        }
//    }
//
//    public static void updateScheduleJob(Scheduler scheduler, ScheduleJob scheduleJob) {
//        try {
//            // 表达式调度构建器
//            CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression()).withMisfireHandlingInstructionDoNothing();
//
//            CronTrigger cronTrigger = getCronTrigger(scheduler, scheduleJob.getJobId());
//
//            //按新的cronExpression表达式重新构建trigger
//            cronTrigger = cronTrigger.getTriggerBuilder().withIdentity(getTriggerKey(scheduleJob.getJobId())).withSchedule(cronScheduleBuilder).build();
//
//            cronTrigger.getJobDataMap().put("JOB_PARAM_KEY",scheduleJob);
//
//            scheduler.rescheduleJob(getTriggerKey(scheduleJob.getJobId()),cronTrigger);
//            //暂停任务
//            if (scheduleJob.getStatus().equals("0")) {
//                pauseJob(scheduler, scheduleJob.getJobId());
//            }
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//            throw new RuntimeException("更新定时任务失败", e);
//        }
//
//    }
//
//    /**
//     *暂停任务
//     * @param scheduler
//     * @param jobId
//     */
//    private static void pauseJob(Scheduler scheduler, String jobId) {
//        try {
//            scheduler.pauseJob(getJobKey(jobId));
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//            throw new RuntimeException("暂停定时任务失败", e);
//        }
//    }
//
//    /**
//     * 立即执行任务
//     */
//    public static void run(Scheduler scheduler, ScheduleJob scheduleJob) {
//        try {
//            //参数
//            JobDataMap dataMap = new JobDataMap();
//            dataMap.put("JOB_PARAM_KEY", scheduleJob);
//
//            scheduler.triggerJob(getJobKey(scheduleJob.getJobId()), dataMap);
//        } catch (SchedulerException e) {
//            throw new RuntimeException("立即执行定时任务失败", e);
//        }
//    }
//
//    /**
//     * 恢复任务
//     */
//    public static void resumeJob(Scheduler scheduler, String jobId) {
//        try {
//            scheduler.resumeJob(getJobKey(jobId));
//        } catch (SchedulerException e) {
//            throw new RuntimeException("暂停定时任务失败", e);
//        }
//    }
//
//    /**
//     * 删除定时任务
//     */
//    public static void deleteScheduleJob(Scheduler scheduler, String jobId) {
//        try {
//            scheduler.deleteJob(getJobKey(jobId));
//        } catch (SchedulerException e) {
//            throw new RuntimeException("删除定时任务失败", e);
//        }
//    }
//
//
//    public static CronTrigger getCronTrigger(Scheduler scheduler, String jobId) {
//        try {
//            return (CronTrigger) scheduler.getTrigger(getTriggerKey(jobId));
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//            throw new RuntimeException("获取定时任务CronTrigger出现异常", e);
//        }
//    }
//
//
//    /**
//     * 获取触发器key
//     */
//    public static TriggerKey getTriggerKey(String jobId) {
//        return TriggerKey.triggerKey(JOB_NAME + jobId);
//    }
//
//    /**
//     * 获取jobKey
//     */
//    public static JobKey getJobKey(String jobId) {
//        return JobKey.jobKey(JOB_NAME + jobId);
//    }
}


