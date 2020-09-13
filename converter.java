package com.company;

public class converter {
    public static class TempConverter{
        public static double convertToFahr(double celsius) {

            System.out.println("lol");
            celsius = (celsius/5)*9+32;
            return celsius;

        }

        public static double convertToCelsius(double fahr) {

            System.out.println("lol");
            fahr = ((fahr-32)*5)/9;
            return fahr;

        }
    }
}
