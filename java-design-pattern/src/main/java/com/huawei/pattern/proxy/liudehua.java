package com.huawei.pattern.proxy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:14
 * @description
 */
public class liudehua implements Sing {
    public liudehua() {
        loadSing();
    }

    private void loadSing() {
        System.out.println("准备演唱会场地");
    }

    @Override
    public void sing() {
        System.out.println("刘德华在唱歌");
    }
}
