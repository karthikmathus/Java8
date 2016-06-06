package com.karthikkannan.study.example.stream;

import com.karthikkannan.study.example.stream.util.FoodType;
import com.karthikkannan.study.example.stream.util.MenuFactory;
import com.karthikkannan.study.example.stream.util.MenuItem;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kannanka on 06/06/2016.
 */
public class FilterSliceStreamExample {
    public static void main(String args[]) {
        List<MenuItem> restmenu = MenuFactory.getMenu();

        // collect the non veg menu items

        List<MenuItem> nonVeg = restmenu.stream().filter((x)-> x.getFoodType() == FoodType.NON_VEGETERIAN).collect(Collectors.toList());
        System.out.println("The non veg menu available are" );
        nonVeg.stream().forEach(System.out::println);

        // collecting unique item
        long distMenuCount = restmenu.stream().distinct().count();

        // Manipulation.

        List<MenuItem> firstThree = restmenu.stream().limit(3).collect(Collectors.toList());
        List<MenuItem> lstFive = restmenu.stream().skip(4).collect(Collectors.toList());

    }
}
