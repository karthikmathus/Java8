package com.karthikkannan.study.example.stream;

import com.karthikkannan.study.example.stream.util.FoodType;
import com.karthikkannan.study.example.stream.util.MenuFactory;
import com.karthikkannan.study.example.stream.util.MenuItem;

import java.util.Comparator;
import java.util.List;

/**
 * Created by kannanka on 05/06/2016.
 */
public class StreamIterateExample {

    public static void main(String args[]){
        List<MenuItem> restmenu = MenuFactory.getMenu();

        //Iterate.
        restmenu.stream().forEach(System.out::println);

        long totcount = restmenu.parallelStream().count();
        System.out.println("The total list county " + totcount);

        totcount = restmenu.stream().filter((x)-> x.getFoodType() == FoodType.NON_VEGETERIAN).count();
        System.out.println("Total non veg menus are " + totcount);

        // Ugly way of writing sorting.
        restmenu.stream().sorted((x,y)-> {
                if (x.getCalories()> y.getCalories()) {
                            return -1;
                }
            return 0;
        }).forEach(System.out::println);

        System.out.println("");

        // proper way of writing sorting.
        restmenu.stream().sorted(Comparator.comparing(MenuItem::getName)).forEach(System.out::println);
    }


}
