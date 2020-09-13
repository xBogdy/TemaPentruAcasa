package com.company;

public class comparator {
    public static class NumbersComparator{
        public static int max(int x,int y,int z){
        return Math.max(x,Math.max(z,y));
        }
        public static int min(int x,int y,int z){
            return Math.min(x,Math.min(z,y));
        }
    }
}
