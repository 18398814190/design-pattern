package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:53
 * @description
 */
public interface MusicPlayer {
    String MP3_TYPE = "MP3";
    String MP4_TYPE = "MP4";
    String VLC_TYPE = "VLC";

    void play(String audioType, String fileName);
}
