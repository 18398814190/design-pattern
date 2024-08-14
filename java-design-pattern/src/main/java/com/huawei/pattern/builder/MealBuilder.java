package com.huawei.pattern.builder;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:13
 * @description
 */
public class MealBuilder {

    public Meal getNiuRouMeal() {
        Meal meal = new Meal();
        meal.addFood(new NiuRouHanBao("牛肉汉堡", 10.0f));
        meal.addFood(new keleDrink("可乐饮料", 5.0f));
        return meal;
    }

    public Meal getChickenMeal() {
        Meal meal = new Meal();
        meal.addFood(new ChickenHanBao("鸡肉汉堡", 8.0f));
        meal.addFood(new XuebiDrink("雪碧饮料", 5.0f));
        return meal;
    }
}
