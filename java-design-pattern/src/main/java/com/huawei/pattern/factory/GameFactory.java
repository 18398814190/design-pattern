package com.huawei.pattern.factory;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:28
 * @description
 */
public class GameFactory {

    public Game createGame(String gameName) {
        if (Game.WAVE_GAME.equalsIgnoreCase(gameName)) {
            return new WaveGame();
        } else if (Game.SNOW_GAME.equalsIgnoreCase(gameName)) {
            return new SnowGame();
        } else if (Game.LOL_GAME.equalsIgnoreCase(gameName)) {
            return new LolGame();
        }
        return null;
    }

}
