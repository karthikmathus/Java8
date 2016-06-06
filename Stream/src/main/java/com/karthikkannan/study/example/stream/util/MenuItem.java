package com.karthikkannan.study.example.stream.util;

/**
 * Created by kannanka on 05/06/2016.
 */
public class MenuItem{
    private String name;
    private String cuisine;
    private int calories;

    public String toString(){
        return "Name :" + name + " - Cuisine : " + cuisine + " - Calories : " + calories + " - Type :" + foodType.toString();
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    private FoodType foodType;
    public MenuItem(String name, String cuisine, int calories, FoodType foodType){
        this.name = name;
        this.cuisine = cuisine;
        this.calories = calories;
        this.foodType = foodType;
    }
}
