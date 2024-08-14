package com.huawei.pattern.singleton;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:46
 * @description 双重检查
 */
public class SingletonPeople3 {
    private static SingletonPeople3 instance;
    private SingletonPeople3() {}

    public static SingletonPeople3 getInstance() {
        if (instance == null) {
            synchronized (SingletonPeople3.class) {
                if (instance == null) {
                    instance = new SingletonPeople3();
                }
            }
        }
        return instance;
    }
}
