package com.panion;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("James", LocalDate.of(1990, 1, 1));

        // print "<name> is <age> years old"
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
    }
}