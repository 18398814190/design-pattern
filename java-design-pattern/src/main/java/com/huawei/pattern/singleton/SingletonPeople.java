package com.huawei.pattern.singleton;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:43
 * @description 饿汉式
 */
public class SingletonPeople {
    private static final SingletonPeople instance = new SingletonPeople();

    private SingletonPeople() {}

    public static SingletonPeople getInstance() {
        return instance;
    }
}
