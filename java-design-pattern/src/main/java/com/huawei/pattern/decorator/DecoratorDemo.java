package com.huawei.pattern.decorator;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:16
 * @description 装饰器模式
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Sing sing = new liudehuaDecorator();
        sing.sing();
    }
}
