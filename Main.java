package com.company.exerc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        Person person1= new Person("Eoris", LocalDate.parse("2000-10-06"));
        Person person2= new Person("Aori", LocalDate.parse("1999-11-05"));
        Person person3= new Person("Cor", LocalDate.parse("2001-06-02"));
        Person person4= new Person("Do", LocalDate.parse("1998-12-10"));
        Person person5= new Person("Bob", LocalDate.parse("1969-11-10"));

        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        person.add(person5);
        Iterator itr = person.iterator();

        while(itr.hasNext() ){
            Person st=(Person) itr.next();
            System.out.println(st.name+" "+st.birthDate);

        }

    }
}
