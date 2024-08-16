package com.huawei.pattern.proxy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:15
 * @description
 */
public class liudehuaProxy implements Sing {
    private Sing sing;

    @Override
    public void sing() {
        if (sing == null) {
            sing = new liudehua();
        }
        sing.sing();

        System.out.println("刘德华结束唱歌");
    }
}
