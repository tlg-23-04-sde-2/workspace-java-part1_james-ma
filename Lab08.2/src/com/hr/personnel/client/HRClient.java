/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 5000.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 40, 40));
        dept.addEmployee(new SalariedEmployee("James", LocalDate.of(2022 , 1, 1), 2500.0));
        dept.addEmployee(new HourlyEmployee("Jake", LocalDate.of(2023, 1, 1), 20, 40));
        dept.addEmployee(new Executive("Ja", LocalDate.of(2024, 1, 1), 250_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay employees
        System.out.println("Pay employees:");
        dept.payEmployees();

        // forced holiday break
        System.out.println("\nForced holiday break");
        dept.holidayBreak();
    }
}