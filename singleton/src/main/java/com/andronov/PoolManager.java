package com.andronov;

import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@DependsOn("Configuration")
@Startup
@Singleton
public class PoolManager {

    private Queue<Object> pooledObjects;

    @PostConstruct
    void constructExpensiveObjects() {
        pooledObjects = new LinkedBlockingQueue<>(1_000);
        for (int i = 0; i <= 1_000; i++) {
            pooledObjects.offer(new Object());
        }
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void returnObject(Object obj) {
        pooledObjects.offer(obj);
    }

    @Lock(LockType.READ)
    public Object borrowObject() {
        return pooledObjects.poll();
    }
}
