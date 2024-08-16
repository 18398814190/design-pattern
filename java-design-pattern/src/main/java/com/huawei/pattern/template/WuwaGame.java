package com.huawei.pattern.template;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 22:09
 * @description
 */
public class WuwaGame implements GameStartTemplate{
    @Override
    public void init() {
        System.out.println("WuwaGame init...");
    }

    @Override
    public void start() {
        System.out.println("WuwaGame start...");
    }

    @Override
    public void end() {
        System.out.println("WuwaGame end...");
    }
}
