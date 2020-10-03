package com.arrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de cifre adunate");
        int[] x = new int[scanner.nextInt()];

        for (int i = 0,j=0; i < x.length; i++,j++) {
            System.out.println("introduceti nr["+i+"]");
            x[i] = scanner.nextInt();
            z+=x[i];
        }
        System.out.println("Suma = "+z);
    }
}