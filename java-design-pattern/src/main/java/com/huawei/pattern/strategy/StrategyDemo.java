package com.huawei.pattern.strategy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:59
 * @description 策略模式
 */
public class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new SumStrategy());
        context.executeStrategy(1, 2);
        context.setStrategy(new ChenStrategy());
        context.executeStrategy(1, 2);
    }
}
