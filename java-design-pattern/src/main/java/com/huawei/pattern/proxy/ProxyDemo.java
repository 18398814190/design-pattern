package com.huawei.pattern.proxy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:16
 * @description 代理模式和装饰器模式的区别在于，装饰器模式注重于增强功能，代理模式用于访问控制
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Sing sing = new liudehuaProxy();
        sing.sing();

        sing.sing();
    }
}
