package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    double salary;


    //constructors
    public SalariedEmployee() {
        super();
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

    // Business methods
    @Override
    public void pay() {
        double payment = getSalary();
        System.out.printf("%s is paid %s\n", super.getName(), payment);
    }

    public void takeVacation() {
        System.out.printf("%s is on vacation!!\n", getName());
    }

    public void payTaxes() {
        double taxedAmount = getSalary() *SALARIED_TAX_RATE;
        System.out.printf("%s paid taxes of %s\n", getName(), taxedAmount );
    }


    //getters and setters



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    //toString
    public String toString() {
//        return super.toString() + " Salary=" + getSalary();

       return String.format("%s, Salary=%s\n", super.toString(), getSalary());
    }
}