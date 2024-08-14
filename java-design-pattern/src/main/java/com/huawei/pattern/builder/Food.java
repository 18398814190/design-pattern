package com.huawei.pattern.builder;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:54
 * @description
 */
public interface Food {
    float getPrice();

    String getName();

    Packing getPacking();
}
