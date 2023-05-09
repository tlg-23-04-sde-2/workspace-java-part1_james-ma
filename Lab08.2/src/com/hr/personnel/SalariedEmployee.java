package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // Instance variables
    private double salary;

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
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
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