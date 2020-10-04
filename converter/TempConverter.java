package com.step.converter;

import java.util.Scanner;

public class TempConverter {

/*    public static void convertToFahr(double celsius) {
        double celsius1 =celsius;
        System.out.println("lol");
        celsius = (celsius/5)*9+32;
        System.out.println(celsius1+"°C→"+celsius+"°F");
     }


    public static void convertToCelsius(double fahr) {
        double fahr1=fahr;
        System.out.println("Converting To Celsius...");
        fahr = ((fahr-32)*5)/9;
        System.out.println(fahr1+"°F→"+fahr+"°C");*/
public static void convertToFahr() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduceti °C pentru convertire");
    double celsius = scanner.nextDouble();
    double celsius1 =celsius;
    System.out.println("lol");
    celsius = (celsius/5)*9+32;
    System.out.println(celsius1+"°C→"+celsius+"°F");
}


    public static void convertToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti °F pentru convertire");
        double fahr=scanner.nextDouble();
        double fahr1=fahr;
        System.out.println("Converting To Celsius...");
        fahr = ((fahr-32)*5)/9;
        System.out.println(fahr1+"°F→"+fahr+"°C");

    }
}
