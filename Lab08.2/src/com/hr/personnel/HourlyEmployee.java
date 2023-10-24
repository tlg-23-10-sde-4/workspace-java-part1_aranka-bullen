package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    //fields
    public double rate;
    public double hours;


    //constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public  HourlyEmployee (String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }


    //getter and setter


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //toString
    public String toString() {
        return String.format("%s: Name=%s, HireDate=%s, Rate=%s, Hours=%s \n",
                  getClass().getSimpleName(), getName(), getHireDate(), getRate(), getHours());
    }
}