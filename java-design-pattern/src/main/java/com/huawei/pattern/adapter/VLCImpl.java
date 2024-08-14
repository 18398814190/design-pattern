package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:02
 * @description
 */
public class VLCImpl implements VedioPlayer {
    @Override
    public void playVLC(String audioType, String fileName) {
        System.out.println("VLCType " + "fileName: " + fileName);
    }

    @Override
    public void playMP4(String audioType, String fileName) {

    }
}
