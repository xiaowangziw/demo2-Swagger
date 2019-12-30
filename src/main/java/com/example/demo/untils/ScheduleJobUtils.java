package com.example.demo.untils;

import org.quartz.JobExecutionContext;

import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Value;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;


/**
 * 定时任务工具
 * author : zhangyongzhao
 * createTime : 2019/5/29
 */
@Component
public class ScheduleJobUtils {// extends QuartzJobBean
//
//    private ExecutorService service = Executors.newSingleThreadExecutor();
////    private static Logger logger = Logger.getLogger(ScheduleJobUtils.class);
//
//    @Value("${spring.application.name}")
//    private String projectName;
//
////    @Autowired
////    private JedisCluster jedisCluster;
//
//
//
//    @Override
//    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("JOB_PARAM_KEY");
//        //分布式锁
////        String lockKey = "job_" + projectName + "_" + scheduleJob.getJobId();
////        int time = 60*1000;
////        if (scheduleJob.getInvalidTime() != null && scheduleJob.getInvalidTime() != 0) {
////            time = scheduleJob.getInvalidTime();
////        }
////        boolean isLock = RedisTool.tryGetDistributedLock(jedisCluster, lockKey, lockKey, time);
////        if (!isLock) {
////            return;
////        }
//        //任务开始时间
//        long startTime = System.currentTimeMillis();
//        //用多线程 执行任务
////        logger.info("任务准备执行，任务ID：" + scheduleJob.getJobId());
//        ScheduleRunnable task = null;
//        try {
//            task = new ScheduleRunnable(scheduleJob.getBeanName(),
//                    scheduleJob.getMethodName(), scheduleJob.getParams());
//            Future<?> future = service.submit(task);
//            future.get();
//        } catch (Exception e) {
//            e.printStackTrace();
////            logger.info("任务执行失败，任务ID：" + scheduleJob.getJobId());
//
//            //任务执行总时长
//            long times = System.currentTimeMillis() - startTime;
//        } finally {
////            RedisTool.releaseDistributedLock(jedisCluster, lockKey, lockKey);
//        }
//    }
//
//    //获取本地IP地址
//    private String getHostIP() {
//        String tempIP = "127.0.0.1";
//        try {
//            tempIP = InetAddress.getLocalHost().getHostAddress();
//        } catch (UnknownHostException e1) {
//            return tempIP;
//        }
//        try {
//            Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
//            InetAddress ip;
//            Enumeration<InetAddress> addrs;
//            while (networks.hasMoreElements()) {
//                addrs = networks.nextElement().getInetAddresses();
//                while (addrs.hasMoreElements()) {
//                    ip = addrs.nextElement();
//                    if (ip != null
//                            && ip instanceof Inet4Address
//                            && ip.isSiteLocalAddress()
//                            && !ip.getHostAddress().equals(tempIP)) {
//                        return ip.getHostAddress();
//                    }
//                }
//            }
//            return tempIP;
//        } catch (Exception e) {
//            return tempIP;
//        }
//    }

}



