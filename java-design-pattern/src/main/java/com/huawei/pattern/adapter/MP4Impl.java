package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:04
 * @description
 */
public class MP4Impl implements VedioPlayer {
    @Override
    public void playVLC(String audioType, String fileName) {

    }

    @Override
    public void playMP4(String audioType, String fileName) {
        System.out.println("MP4Type " + "fileName: " + fileName);
    }
}
