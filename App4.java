package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti num1");
        int z =myObj.nextInt();
        System.out.println("Introduceti num2");
        int x =myObj.nextInt();
        System.out.println("Introduceti num3");
        int y =myObj.nextInt();

        System.out.println("Num1 vs Num2 vs Num3|"+" max = "+comparator.NumbersComparator.max(z,x,y));
        System.out.println("Num1 vs Num2 vs Num3|"+" min = "+comparator.NumbersComparator.min(z,x,y));

    }
}
