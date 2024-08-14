package com.huawei.pattern.adapter;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:54
 * @description
 */
public class MusicPlayerImpl implements MusicPlayer {

    private  AdapterPlayer adapterPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if (MusicPlayer.MP3_TYPE.equals(audioType)) {
            System.out.println("MP3Type " + "fileName: " + fileName);
        } else if (MusicPlayer.MP4_TYPE.equals(audioType)) {
            adapterPlayer = new AdapterPlayer(new MP4Impl());
            adapterPlayer.play(audioType, fileName);
        } else if (MusicPlayer.VLC_TYPE.equals(audioType)) {
            adapterPlayer = new AdapterPlayer(new VLCImpl());
            adapterPlayer.play(audioType, fileName);
        } else {
            System.out.println("no find audioType: " + audioType);
        }

    }
}
