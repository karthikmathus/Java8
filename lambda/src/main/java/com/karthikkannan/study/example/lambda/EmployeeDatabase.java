package com.karthikkannan.study.example.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kannanka on 04/06/2016.
 */
public class EmployeeDatabase {
    public static List<Employee> getEmployeeData() {
        return Arrays.asList(new Employee("Andy", "IT", 35, 1500),
                new Employee("Anand", "HR", 42, 2300),
                new Employee("Bharath", "IT", 38, 3500),
                new Employee("Charlotte", "IT", 43, 3800));

    }
}