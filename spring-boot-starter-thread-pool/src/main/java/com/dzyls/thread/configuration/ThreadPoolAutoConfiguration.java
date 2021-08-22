package com.dzyls.thread.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/8/20 21:49
 * @Version 1.0.0
 * @Description:
 */
@Configuration
@ConfigurationProperties(prefix = "thread")
public class ThreadPoolAutoConfiguration {

    private int coreSize = 5;

    private int maxSize = 10;

    private long keepAliveTime = 1000l;

    private int capacity = 50;

    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){
        return new ThreadPoolExecutor(coreSize,maxSize,keepAliveTime, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(capacity));
    }

}
