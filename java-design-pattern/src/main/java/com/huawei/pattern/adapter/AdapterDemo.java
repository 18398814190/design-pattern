package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:52
 * @description 适配器模式
 */
public class AdapterDemo {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayerImpl();

        musicPlayer.play(MusicPlayer.MP3_TYPE, "你好");
        musicPlayer.play(MusicPlayer.MP4_TYPE, "你好");
        musicPlayer.play(MusicPlayer.VLC_TYPE, "你好");
    }
}
