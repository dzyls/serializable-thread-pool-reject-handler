package com.dzyls.serializable.handler.impl;

import com.dzyls.serializable.handler.SerializableRejectExecutionHandler;

/**
 * @Author <a href="stringnotnull@gmail.com">dzyls</a>
 * @Date 2021/8/21 23:55
 * @Version 1.0.0
 * @Description:
 */
public class DBStorePolicy extends SerializableRejectExecutionHandler {

    public DBStorePolicy(String threadPoolName) {
        super(threadPoolName);
    }

    @Override
    public Runnable fetchTask(int size) {
        // todo : fetchTask from db
        return null;
    }

    @Override
    protected boolean storeTask(Runnable r) {
        // todo : store task to db
        return false;
    }
}
