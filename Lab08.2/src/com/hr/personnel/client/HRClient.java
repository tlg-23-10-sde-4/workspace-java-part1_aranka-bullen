/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept); //toString() automatically called

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),1175));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1275.0));

        //HourlyEmployee test
        dept.addEmployee(new HourlyEmployee("Anna", LocalDate.of(2023,10,25), 25.0, 40.0));

        //SalariedEmployee test
        dept.addEmployee( new SalariedEmployee("Janna", LocalDate.of(2023,10,25), 57000.0));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay Employees");
        dept.payEmployees();




    }
}