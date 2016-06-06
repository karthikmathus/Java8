package com.karthikkannan.study.example.stream;

import com.karthikkannan.study.example.stream.util.MenuFactory;
import com.karthikkannan.study.example.stream.util.MenuItem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kannanka on 06/06/2016.
 */
public class MappingStreamExample {
    public static void main(String args[]) {
        List<MenuItem> restmenu = MenuFactory.getMenu();

        // List only the menu names.
        restmenu.stream().map(MenuItem::getName).forEach(System.out::println);

        // Flat map example.
        // This method will convert two Stream<String[]> into single list of character

        String[] arrayOfWords = {"Hello", "World"};
        Stream<String> streamOfwords = Arrays.stream(arrayOfWords);

        List<String> words = Arrays.asList("I","Love","My","Family");
        // map will make stream of String[]
        Stream<String[]> mapvar = words.stream().map(str->str.split(""));

        // map and flatmap difference
        //Stream<Stream<String[]>> strstream = words.stream().map(str->str.split("")).map(Arrays::stream);

        //flatmap will amalgamate stream<stream<String>> into single list
        List<String> charList = words.stream().map(str->str.split("")).flatMap(Arrays::stream).collect(Collectors.toList());

    }

}
