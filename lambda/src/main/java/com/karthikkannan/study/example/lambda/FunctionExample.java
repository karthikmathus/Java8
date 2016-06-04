package com.karthikkannan.study.example.lambda;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToDoubleFunction;

/**
 * Created by kannanka on 04/06/2016.
 */
public class FunctionExample {

    public static void main(String args[]){
        System.out.println(intOperation(FunctionExample::add,1,4));

        System.out.println(intOperation(FunctionExample::multiply,1,4));

        IntBinaryOperator intb = FunctionExample::add;
        IntToDoubleFunction inttoD = FunctionExample::exponential;

        System.out.println(intToDouble(inttoD,3));

    }

    public static double exponential(int a){
       return a*a*a*a;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int intOperation(IntBinaryOperator binOp,int a, int b){
        return binOp.applyAsInt(a,b);
    }

    public static double intToDouble(IntToDoubleFunction func, int a){
        return func.applyAsDouble(a);
    }
}
