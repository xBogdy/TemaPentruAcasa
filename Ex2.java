package com.arrays;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de cifre");
        int l = scanner.nextInt();
        int[] x = new int[l];

        for (int i = 0,j=0; i < x.length; i++,j++) {
            System.out.println("introduceti nr["+i+"]");
            x[i] = scanner.nextInt();

        }
        for(int i=0;i<x.length;i++)
        {
            System.out.println("Nr["+ l-- +"] = "+ x[l]);
        }
    }
}