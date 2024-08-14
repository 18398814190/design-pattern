package com.huawei.pattern.singleton;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:46
 * @description 静态内部类
 */
public class SingletonPeople4 {
    private SingletonPeople4() {}

    private static class SingletonPeople4InstanceHolder {
        private static final SingletonPeople4 instance = new SingletonPeople4();
    }

    public static SingletonPeople4 getInstance() {
        return SingletonPeople4InstanceHolder.instance;
    }
}
