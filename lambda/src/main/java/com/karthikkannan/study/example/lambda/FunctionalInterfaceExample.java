package com.karthikkannan.study.example.lambda;

import java.util.List;

/**
 * Created by kannanka on 04/06/2016.
 */
public class FunctionalInterfaceExample {
    public static void main(String args[]){
        List<Employee> empList = EmployeeDatabase.getEmployeeData();
        EmployeeAwarder startAwarder = (e)-> {return "Hi " + e.getName() + " you are awarded star of month award";};
        EmployeeAwarder cashAwarder = (e) -> {return "Hi " + e.getName() + " you are awarded cash prize of " + e.getSalary()/10;};

        presentAward(startAwarder,empList.get(0));
        presentAward(cashAwarder,empList.get(1));
    }

    public static void presentAward(EmployeeAwarder awarder, Employee e){
        System.out.println(awarder.giveAward(e));
    }
}
@FunctionalInterface
interface EmployeeAwarder{
    public String giveAward(Employee e);
}