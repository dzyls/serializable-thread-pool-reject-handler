package com.dzyls.serializable.handler;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/8/21 23:50
 * @Version 1.0.0
 * @Description: 可序列化RejectExecutionHandler的抽象父类
 */
public abstract class SerializableRejectExecutionHandler implements RejectedExecutionHandler {

    protected String threadPoolName;

    protected SerializableRejectExecutionHandler(String threadPoolName) {
        this.threadPoolName = threadPoolName;
    }

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        storeTask(r);
    }

    public abstract Runnable fetchTask(int size);

    protected abstract boolean storeTask(Runnable r);

}
