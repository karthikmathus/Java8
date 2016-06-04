package com.karthikkannan.study.example.lambda;


import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by kannanka on 04/06/2016.
 */
public class MethodReferenceExample {

    public static void main(String args[]) {

        List<Employee> employeeList = EmployeeDatabase.getEmployeeData();

        employeeList.sort(comparing(Employee::getAge));
        employeeList.stream().map((x) -> x.getAge()).forEach(System.out::println);

        employeeList.stream().forEach(EmployeeCommunicator::printPayslip);

        employeeList.stream().map(EmployeeCommunicator::getOfferLetter).forEach(System.out::println);

    }

}

class EmployeeCommunicator{

    public static void printPayslip(Employee emp){
      System.out.println("Your pay for this month is "+ emp.getSalary()/12);
    }

    public static String getOfferLetter(Employee emp){

        return new StringBuilder("Hi ").append(emp.getName())
                .append(" you are offered employment in ").append(emp.getDepartment())
                .append(" Department with salary ").append(emp.getSalary()).toString();
    }
}

