package com.huawei.pattern.strategy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:58
 * @description
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2) {
        strategy.execute(num1, num2);
    }
}
