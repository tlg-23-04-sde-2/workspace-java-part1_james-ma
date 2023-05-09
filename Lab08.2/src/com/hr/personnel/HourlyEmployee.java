package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // Instance Variables
    private double rate;
    private double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); // delegate to superclass ctor
        setRate(rate);
        setHours(hours);
    }

    // Business methods or "action" methods
    public void pay() {
        double payment = getRate() * getHours();
        System.out.println(getName() + " is paid hourly " + payment);
    }

    // Accessor methods
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
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}