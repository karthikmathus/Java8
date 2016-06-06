package com.karthikkannan.study.example.stream.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by kannanka on 05/06/2016.
 */
public class MenuFactory {

    private static List<MenuItem> restaurantMenu;
    public static List<MenuItem> getMenu(){
        restaurantMenu = new ArrayList<MenuItem>();
        restaurantMenu.addAll(Arrays.asList( new MenuItem("pork fry", "Western", 800, FoodType.NON_VEGETERIAN),
                new MenuItem("beef fry", "Western", 700, FoodType.NON_VEGETERIAN),
                new MenuItem("green chicken", "Continental", 400, FoodType.NON_VEGETERIAN),
                new MenuItem("french fries", "Western", 530, FoodType.NON_VEGETERIAN),
                new MenuItem("rice pudding", "Asian", 350, FoodType.VEGAN),
                new MenuItem("season fruit", "All", 120, FoodType.VEGETERIAN),
                new MenuItem("pizza", "Mediteranean", 1200, FoodType.VEGETERIAN),
                new MenuItem("prawns curry", "Mediteranean", 300, FoodType.NON_VEGETERIAN),
                new MenuItem("salmon salad", "Western", 450, FoodType.NON_VEGETERIAN)));
        return restaurantMenu;
    }
}

