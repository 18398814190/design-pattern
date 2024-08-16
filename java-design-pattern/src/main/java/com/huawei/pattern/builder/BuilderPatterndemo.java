package com.huawei.pattern.builder;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:18
 * @description 建造者模式
 */
public class BuilderPatterndemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal chickenMeal = mealBuilder.getChickenMeal();
        chickenMeal.getFoodInfo();

        Meal niuRouMeal = mealBuilder.getNiuRouMeal();
        niuRouMeal.getFoodInfo();
    }
}
