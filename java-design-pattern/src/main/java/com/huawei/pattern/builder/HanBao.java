package com.huawei.pattern.builder;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:56
 * @description
 */
public abstract class HanBao implements Food{
    public String hanBaoName;

    public float hanBaoPrice;

    @Override
    public Packing getPacking() {
        return new BottlePack();
    }

    @Override
    public float getPrice() {
        return hanBaoPrice;
    }

    @Override
    public String getName() {
        return hanBaoName;
    }
}
