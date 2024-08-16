package com.huawei.pattern.factory;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 20:31
 * @description 工厂模式
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.createGame(Game.LOL_GAME);
        game.play();
    }
}
