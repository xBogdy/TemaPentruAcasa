package com.company.manager;

import java.util.Date;

public class Employee {
static String[] name = new String[100];
static String[] surname = new String[100];
static Date[] birthdate = new Date[100];

    public Employee() {

    }
    public Employee(String nume,String prenume,int index){
        name[index] = nume;
        surname[index] = prenume;    }
    public Employee(String nume, String prenume, Date bd, int index){
        name[index] = nume;
        surname[index] = prenume;
        birthdate[index] = bd;
    }
    public static String getName(int index) { return name[index]; }

}