package com.huawei.pattern.factory;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:29
 * @description
 */
public interface Game {
    String SNOW_GAME = "snowGame";
    String LOL_GAME = "lolGame";
    String WAVE_GAME = "waveGame";

    void play();
}
