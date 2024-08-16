package com.huawei.pattern.singleton;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:44
 * @description 单例模式
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonPeople instance = SingletonPeople.getInstance();
        SingletonPeople5 instance1 = SingletonPeople5.instance;
        SingletonPeople3 instance2 = SingletonPeople3.getInstance();
    }
}
