package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    //FIELDS


    //CONSTRUCTORS
    public Executive(String name, LocalDate hireDate, double salary){
        super(name,hireDate, salary);
    }


    //METHODS


    @Override
    public void work() {
        System.out.printf("%s is playing golf..\n", getName());
    }

    @Override
    public void pay() {
       super.pay();
    }

    @Override
    public void takeVacation() {
        super.takeVacation();
    }

    //TOSTRING

}