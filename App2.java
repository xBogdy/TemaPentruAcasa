package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti temperatura °C");

        double j =myObj.nextDouble();

        System.out.println(j +"°C →"+ converter2.TempConverter.convertToFahr(j)+"°F");
        //System.out.println(j +"°F →"+converter.TempConverter.convertToCelsius(j)+"°C");
    }
}
