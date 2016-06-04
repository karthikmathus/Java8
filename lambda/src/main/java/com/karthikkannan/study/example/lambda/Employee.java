package com.karthikkannan.study.example.lambda;

/**
 * Created by kannanka on 04/06/2016.
 */
class Employee{
    String name;

    public void increaseSalary(int percentage){
        salary = salary + (salary * percentage/100);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;
    public Employee(){

    }
    public Employee(String empName, String empDepartment, Integer empAge, double empSalary){
        this.name = empName;
        this.salary = empSalary;
        this.age = empAge;
        this.department = empDepartment;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    int age;
    String department;
}
