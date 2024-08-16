package com.huawei.pattern.template;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/16 22:10
 * @description 模板模式
 */
public class TemplateDemo {
    public static void main(String[] args) {
        GameStartTemplate game = new SnowGame();
        game.play();

        game = new WuwaGame();
        game.play();
    }
}
