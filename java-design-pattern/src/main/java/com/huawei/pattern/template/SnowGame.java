package com.huawei.pattern.template;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 22:08
 * @description
 */
public class SnowGame implements GameStartTemplate{
    @Override
    public void init() {
        System.out.println("snow game init");
    }

    @Override
    public void start() {
        System.out.println("snow game start");
    }

    @Override
    public void end() {
        System.out.println("snow game end");
    }
}
