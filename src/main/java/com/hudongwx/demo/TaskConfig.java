package com.hudongwx.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.config.ContextLifecycleScheduledTaskRegistrar;

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
@Configuration
public class TaskConfig {

    @Bean(destroyMethod = "shutdown")
    public ScheduledThreadPoolExecutor getExecutor(){
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(20);
        executor.setRemoveOnCancelPolicy(true);
        return executor;
    }

}
