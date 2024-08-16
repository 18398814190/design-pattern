package com.huawei.pattern.observer;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:49
 * @description
 */
public class ObserverImpl1 implements Observer {


    @Override
    public void update() {
        System.out.println("ObserverImpl1 update");
    }
}
