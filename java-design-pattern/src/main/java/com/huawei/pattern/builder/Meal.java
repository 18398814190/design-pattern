package com.huawei.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wujinpeng
 * @version 1.0
 * @date 2024/8/14 21:10
 * @description
 */
public class Meal {

    public List<Food> foodList = new ArrayList<>();

    private float getTotalPrice() {
        float totalPrice = 0;
        for (Food food : foodList) {
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }

    void addFood(Food food) {
        foodList.add(food);
    }

    public void getFoodInfo(){
        for (Food food : foodList) {
            System.out.println("食物名称:" + food.getName() + "食物价格:" +  food.getPrice() + "食物打包方式:" +  food.getPacking().pack());
        }
        System.out.println("套餐总价格：" + getTotalPrice());
    }

}
