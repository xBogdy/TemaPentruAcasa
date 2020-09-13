package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti num1");
        float z =myObj.nextFloat();
        System.out.println("Introduceti num2");
        float x =myObj.nextFloat();

        System.out.println("Num1 + Num2"+"="+calculator.Calculator.plus(z,x));
        System.out.println("Num1 + Num2"+"="+calculator.Calculator.minus(z,x));
        System.out.println("Num1 + Num2"+"="+calculator.Calculator.bara(z,x));
        System.out.println("Num1 + Num2"+"="+calculator.Calculator.stea(z,x));
    }
}
