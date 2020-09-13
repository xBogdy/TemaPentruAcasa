package com.company;


public class App {
    public static void main(String[] args) {
        double j=43;

        System.out.println(j +"°C →"+converter.TempConverter.convertToFahr(j)+"°F");
        System.out.println(j +"°F →"+converter.TempConverter.convertToCelsius(j)+"°C");


    }
}
