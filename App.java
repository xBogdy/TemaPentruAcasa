package com.step;

import com.step.converter.TempConverter;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // write your code here
        double x = 13.3;
        Scanner scanner = new Scanner(System.in);
        //scanner.nextInt();
        TempConverter tempConverter = new TempConverter();
        /*        tempConverter.convertToFahr(x);
        tempConverter.convertToCelsius(x);*/
        tempConverter.convertToFahr();
        tempConverter.convertToCelsius();


    }
}
