package com.arrays;

import java.util.Scanner;

public class FindInt     {
    public static void voc(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='Ș'||ch=='ș'||ch=='ă'||ch=='ț'||ch=='î'||ch=='â'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println(ch+" = Vocala");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println(ch+" = Consoana");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] x = new char[10];
        System.out.println("introduceti cuv(max 10 caractere)");
        String p = scanner.next();
        System.out.println("nr caractere :"+p.length());

        for (int i = 0; i < p.length(); i++) {

            x[i] = p.charAt(i);
            voc(x[i]);
        }

    }
}