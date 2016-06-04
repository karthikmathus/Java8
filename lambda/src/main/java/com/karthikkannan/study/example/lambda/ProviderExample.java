package com.karthikkannan.study.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by kannanka on 04/06/2016.
 */
public class ProviderExample {

    public static void main(String args[]){
        Supplier<Employee> c = ()-> new Employee();

        List<Employee> empList = EmployeeDatabase.getEmployeeData();
        empList = new ArrayList<Employee>(empList);  // Array.asList passes fixed size list so cant add.
        Employee empNew = c.get();
        empNew.setName("KK");
        empNew.setDepartment("IT");
        empNew.setSalary(2000);

        empList.add(empNew);

        empList.stream().forEach((x) ->System.out.println(x.getName()));

    }


}


