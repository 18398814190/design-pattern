package com.huawei.pattern.builder;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:57
 * @description
 */
public abstract class Drink implements Food{
    public String drinkName;

    public float drinkPrice;


    @Override
    public Packing getPacking() {
        return new GuanzhuangPack();
    }

    @Override
    public float getPrice() {
        return drinkPrice;
    }

    @Override
    public String getName() {
        return drinkName;
    }
}
