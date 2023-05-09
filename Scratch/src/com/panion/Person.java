package com.panion;

import java.time.LocalDate;
import java.time.Period;

/*
 * An immutable class
 * More accurate, it's a class definition written in such a way that
 * instances of it. once created, can't have their properties changed.
 * In the code, it simply means no public setters.
 */
class Person {
    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    /*
     *Returns the person's age in whole years.
     * See a class in package in java.time that can help you
     * get the *period* of time *between* two dates.
     */
    public int getAge() {
        return Period.between(getBirthDate(),LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + getName() + ", birthDate=" + getBirthDate();
    }
}