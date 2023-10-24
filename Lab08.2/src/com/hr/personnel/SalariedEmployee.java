package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;


    //constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);

        //registerIn401k; //you want to use this() to apply registerIn401k to 3-arg, otherwise
                         // super() would automatically go to the super class without executing
                         // the registerIn401k function.
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);

    }

    //getters and setters



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString
    public String toString() {
        return String.format("%s: Name=%s, HireDate=%s, Salary=%s\n",
            getClass().getSimpleName(), getName(), getHireDate(), getSalary());
    }
}