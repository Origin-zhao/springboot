package com.hudongwx.demo;

import com.hudongwx.demo.utils.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.commonj.ScheduledTimerListener;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.scheduling.concurrent.ScheduledExecutorTask;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ContextLifecycleScheduledTaskRegistrar;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.config.TriggerTask;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.SimpleThreadPoolTaskExecutor;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;
import org.thymeleaf.spring4.util.SpringVersionUtils;

import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 开发公司：hudongwx.com<br/>
 * 版权：294786949@qq.com<br/>
 * <p>
 *
 * @author origin
 * @version 1.0, 2017/1/21 0021 <br/>
 * @desc <p>
 * <p>
 * 创建　origin　2017/1/21 0021　<br/>
 * <p>
 * *******
 * <p>
 * @email 294786949@qq.com
 */
@SuppressWarnings("SpringJavaAutowiringInspection")
@Component("job1")
public class Job1  implements Runnable{

    @Autowired
    ScheduledThreadPoolExecutor executor;

    @Scheduled(fixedRate = 5000)
    public void task1(){
        //DelayTask.execute(new MyTask(),5);
    }

    @Override
    public void run() {
        System.out.println("TriggerTask执行了....");
    }

    public static void main(String[] args) {
       /* ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(10);
        executor.setMaximumPoolSize();
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("==="+executor.getQueue().size());
            }
        },20,TimeUnit.SECONDS);

        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("==="+executor);
            }
        },5,5,TimeUnit.SECONDS);*/
    }

}
