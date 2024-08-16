package com.huawei.pattern.decorator;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:15
 * @description
 */
public class liudehuaDecorator implements Sing{
    private Sing sing = new liudehua();

    @Override
    public void sing() {
        System.out.println("刘德华准备唱歌");
        sing.sing();

        System.out.println("刘德华结束唱歌");
    }
}
