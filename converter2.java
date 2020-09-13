package com.company2;

public class converter2 {
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
