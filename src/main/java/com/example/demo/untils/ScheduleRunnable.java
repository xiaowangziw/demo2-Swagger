package com.example.demo.untils;

import com.example.demo.ApplicationContextProvider;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;

/**
 * 执行定时任务实现
 * author : zhangyongzhao
 * createTime : 2019/5/29
 */
public class ScheduleRunnable implements Runnable {


    private Object target;
    private Method method;
    private String params;

    public ScheduleRunnable(String beanName, String methodName, String params) throws NoSuchMethodException, SecurityException {
        this.target = ApplicationContextProvider.getBeanByName(beanName);
        this.params = params;

        if (StringUtils.isNotBlank(params)) {
            this.method = target.getClass().getDeclaredMethod(methodName, String.class);
        } else {
            this.method = target.getClass().getDeclaredMethod(methodName);
        }
    }


    @Override
    public void run() {
        try {
            ReflectionUtils.makeAccessible(method);
                if (StringUtils.isNotBlank(params)) {
                    method.invoke(target, params);
                } else {
                    method.invoke(target);
                }
        } catch (Exception e) {
//            logger.error("执行定时任务失败", e);
            throw new RuntimeException(e);
        }
    }
}


