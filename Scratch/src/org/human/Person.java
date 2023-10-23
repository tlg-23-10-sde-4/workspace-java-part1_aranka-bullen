package org.human;


import java.io.File;
import java.time.LocalDate;
import java.time.Period;

/*
 * Am immutable class. A class definition written in such a way that oncce
 * created that instances of  it once created cannot have their properties changed
 * There are simply no public methods to do so.
 *
 */
class Person {
    //FIELDS
    private final String name;
    private final LocalDate birthDate;
    private File birthCertificate;

    public Person(String name, LocalDate birthDate){ //use direct field assignment when you do not want to
        this.name = name;                           // use setters. This makes the class immutable, meaning
        this.birthDate = birthDate;                 // that the fields cannot be changed once assigned.

    }

    /*
     * Returns the person's age in whole years.
     * This is a "derived property" i.e., it calculated and returned, not stored in a field.
     * HINT: you want to find the period of time in whole years between two dates:
     * The birthdate and today's date.
     * Will be in java.Time
     *
     */
    public int getAge(){
       return Period.between(getBirthdate(), LocalDate.now()).getYears();
    }

    //Getters
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("Person= name=%s, birthdate=%s", getName(), getBirthdate());
    }
}