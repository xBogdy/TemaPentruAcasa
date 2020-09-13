package com.company;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double j=43;

        System.out.println(j +"°C →"+converter.TempConverter.convertToFahr(j)+"°F");
        System.out.println(j +"°F →"+converter.TempConverter.convertToCelsius(j)+"°C");


    }
}
