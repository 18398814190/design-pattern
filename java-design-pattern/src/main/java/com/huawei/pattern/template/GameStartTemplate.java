package com.huawei.pattern.template;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 22:07
 * @description
 */
public interface GameStartTemplate {
    void init();

    void start();

    void end();

    default void play(){
        init();

        start();

        end();
    }
}
