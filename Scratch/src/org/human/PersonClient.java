package org.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("JOHN", LocalDate.of(1992,8,30));
        System.out.println(p1);

    }
}