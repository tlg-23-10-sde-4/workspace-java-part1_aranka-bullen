package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    //fields
    public double rate;
    public double hours;


    //constructors
    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public  HourlyEmployee (String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    // Business methods
    @Override
    public void pay() {
        double payment = getRate() *getHours();
        System.out.printf("%s is paid %s\n", super.getName(), payment);
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

    @Override
    //toString
    public String toString() {

//         return super.toString() + " Rate=" + getRate() + " Hours=" + getHours();

        return String.format("%s, Rate=%s, Hours=%s \n",
                 super.toString(), getRate(), getHours());
    }
}