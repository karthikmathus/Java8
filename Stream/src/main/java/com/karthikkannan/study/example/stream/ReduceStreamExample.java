package com.karthikkannan.study.example.stream;

import java.util.List;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by kannanka on 06/06/2016.
 */
public class ReduceStreamExample {
    public static void main(String args[]){

        List<Integer> intList = Arrays.asList(4,8,9,20,34,22,18,4,8);
        // find max
        intList.stream().max(Integer::max);
        //find Min
        intList.stream().min(Integer::min);

        // find sum
        intList.stream().reduce((x,y) -> x+y);

        // Fibonacci series

        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0]+t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] +")"));

    }
}
