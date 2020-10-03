package com.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de cifre");
        int l = scanner.nextInt();
        int[] x = new int[l];

        for (int i = 0; i < x.length; i++) {
            System.out.println("introduceti nr["+i+"]");
            x[i] = scanner.nextInt();

        }
        //mod1
        OptionalInt max= Arrays.stream(x).max();
        OptionalInt min= Arrays.stream(x).min();
        System.out.println("Nr maxim := " + max.getAsInt());
        System.out.println("Nr minim := " + min.getAsInt());
        //mod2
        int max1 = 0;
        int min1 = 0;
        for(int i=0;i<x.length;i++){
            if(max1<x[i]) {
                max1=0;
                max1 += x[i];
            }
        }
        for(int i=0;i<x.length;i++){
            if (i==0){min1=x[i];}
            if(min1>x[i]) {
                min1=0;
                min1 += x[i];
            }
        }

        System.out.println("Nr maxim v2 ="+max1);
        System.out.println("Nr minim v2 ="+min1);
    }
}