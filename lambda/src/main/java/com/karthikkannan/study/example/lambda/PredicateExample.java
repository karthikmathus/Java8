package com.karthikkannan.study.example.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kannanka on 04/06/2016.
 */
public class PredicateExample {

    public static void main(String args[]){

        List<String> names = Arrays.asList("Andy","Anand","Bharath","Charlotte");

        // Stream - everytime you get will get new stream is created thus filtered stream below will not be printed..
        names.stream().filter((String name)-> name.startsWith("A"));
        names.stream().forEach((String name) -> System.out.println(name));

        // Stream - filter and print.
        names.stream().filter((name)-> name.startsWith("A")).forEach((x)->System.out.println(x));
    }
}
