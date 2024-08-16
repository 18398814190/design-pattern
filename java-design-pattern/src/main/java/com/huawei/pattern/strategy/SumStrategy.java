package com.huawei.pattern.strategy;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 21:56
 * @description
 */
public class SumStrategy implements Strategy {
    @Override
    public void execute(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
