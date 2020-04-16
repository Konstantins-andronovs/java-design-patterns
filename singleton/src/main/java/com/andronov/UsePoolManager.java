package com.andronov;

import javax.inject.Inject;

public class UsePoolManager {

    @Inject
    private PoolManager poolManager;

    public void UsePooledObject() {
        Object obj = poolManager.borrowObject();
        // use object
        poolManager.returnObject(obj);
    }
}
