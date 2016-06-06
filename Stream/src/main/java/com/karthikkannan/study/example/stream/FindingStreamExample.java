package com.karthikkannan.study.example.stream;

import com.karthikkannan.study.example.stream.util.FoodType;
import com.karthikkannan.study.example.stream.util.MenuFactory;
import com.karthikkannan.study.example.stream.util.MenuItem;

import java.util.List;
import java.util.Optional;

/**
 * Created by kannanka on 06/06/2016.
 */
public class FindingStreamExample {

    public static void main(String args[]) {
        List<MenuItem> restmenu = MenuFactory.getMenu();

        boolean veganFully = restmenu.stream().allMatch(x-> x.getFoodType() == FoodType.VEGAN);

        Optional<MenuItem> anyChinese = restmenu.stream().filter(x-> x.getCuisine() == "Chinese").findAny();
        System.out.println("The result of any chinese present is " + anyChinese.isPresent());
    }
}
