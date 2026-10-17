package ru.mirea.pr41.employees;

public class Employer {
    private final String firstName;
    private final String lastName;
    private final double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() { return income * 12; }
    @Override
    public String toString() { return firstName + " " + lastName; }
}
