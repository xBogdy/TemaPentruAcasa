package com.company.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class EmployeeDataManager {
    static Employee employee = new Employee();
    static int x=1;
    public static void AddEmployees() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Scanner scanner = new Scanner(System.in);
 /*       System.out.println("Enter employee name");
        employee.name[0]=scanner.next();
        System.out.println("Enter employee surname");
        employee.surname[0]=scanner.next();
        System.out.println("Enter employee birthdate");
        employee.birthdate[0]=simpleDateFormat.parse(scanner.next());*/

//



        for (int i = 0; i < x; i++,x++) {
            System.out.println("Enter employee["+i+"]");
            System.out.println("Enter employee name");
            employee.name[i]=scanner.next();
            System.out.println("Enter employee surname");
            employee.surname[i]=scanner.next();
            System.out.println("Enter employee birthdate");
            employee.birthdate[i]=simpleDateFormat.parse(scanner.next());
            System.out.println("continue adding employees?(True/False)");
            boolean y = scanner.nextBoolean();
            if(y == false){ break;}
            else {continue;}

        }

    }
    public static void DisplayEmployee() {
        for (int i = 0; i < x; i++) {
            System.out.println("Displaying employee[" + i + "]");
            System.out.println(" name : " + employee.name[i] + " surname: " + employee.surname[i] + " birthdate: " + employee.birthdate[i]);
        }
    }
    public static void ManageEmployee() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modify employee");
        int n;
                System.out.println("Enter employee position :");
                n = scanner.nextInt();
                System.out.println("Enter employee name");
                employee.name[n]=scanner.next();
                System.out.println("Enter employee surname");
                employee.surname[n]=scanner.next();
                System.out.println("Enter employee birthdate");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
                employee.birthdate[n]=simpleDateFormat.parse(scanner.next());
        }
        //neterminat
    public static void DeleteEmployee() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Delete employee");
        System.out.println("Enter employee position for delete :");
        int n = scanner.nextInt();
        for (int i = n+=1,j=--i; i < x ; i++,j++) {
            employee.name[i] = employee.name[j];
            employee.surname[i] = employee.surname[j];
            employee.birthdate[i] = employee.birthdate[j];
            employee.name[--x] = null;
            employee.surname[--x] = null;
            employee.birthdate[--x] = null;
        }
    }
    }