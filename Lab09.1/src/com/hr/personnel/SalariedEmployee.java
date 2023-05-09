package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // Instance variables
    private double salary;
    private static final double STANDARD_DEDUCTION = 10_000.0;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // Enrolled into 401k
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // Business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + getSalary() * SALARIED_TAX_RATE);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }
}