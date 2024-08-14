package com.huawei.pattern.singleton;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:45
 * @description 懒汉式
 */
public class SingletonPeople2 {
    private SingletonPeople2() {}
    private static SingletonPeople2 instance;
    public static SingletonPeople2 getInstance() {
        if (instance == null) {
            instance = new SingletonPeople2();
        }
        return instance;
    }
}
