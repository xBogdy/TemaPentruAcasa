package com.company.manager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException {
    EmployeeDataManager.AddEmployees();
    EmployeeDataManager.DisplayEmployee();
    EmployeeDataManager.ManageEmployee();
    EmployeeDataManager.DisplayEmployee();
    EmployeeDataManager.DeleteEmployee();
    EmployeeDataManager.DisplayEmployee();


    }
}
