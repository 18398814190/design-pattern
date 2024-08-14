package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 22:00
 * @description
 */
public interface VedioPlayer {

    void playVLC(String audioType, String fileName);
    void playMP4(String audioType, String fileName);
}
