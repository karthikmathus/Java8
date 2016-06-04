package com.karthikkannan.study.example.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kannanka on 04/06/2016.
 */
public class ConsumerExample {

    public static void main(String args[]){
        long ITEmployeeTotalAge=0;
        List<Employee> employees = EmployeeDatabase.getEmployeeData();

        // Stream - Consumer will take in variable but has void as return..
        employees.stream().forEach((emp) -> printEmployeeDetails(emp));
        employees.stream().filter((Employee emp)-> emp.getDepartment().startsWith("IT")).forEach((emp) -> emp.increaseSalary(20));
        employees.stream().forEach((emp) -> printEmployeeDetails(emp));

        // The above will give salary increment only to IT department employees.
    }

    private static void printEmployeeDetails(Employee emp){
        System.out.println ("Emp Det - " + emp.getName() + " age " + emp.getAge() + " Salary " + emp.getSalary());
    }



}

