package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:53
 * @description
 */
public class AdapterPlayer implements MusicPlayer{

    private VedioPlayer vedioPlayer;

    public AdapterPlayer(VedioPlayer vedioPlayer) {
        this.vedioPlayer = vedioPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        if (MusicPlayer.MP4_TYPE.equals(audioType)) {
            vedioPlayer.playMP4(audioType, fileName);
        } else {
            vedioPlayer.playVLC(audioType, fileName);
        }
    }
}
