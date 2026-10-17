package ru.mirea.pr41.employees;

public class TestEmployer {
    public static void main(String[] args) {
        Employer manager = new Manager("Анна", "Иванова", 70000, 10000);
        Employer[] employees = {new Employer("Иван", "Петров", 60000), manager};
        for (Employer employee : employees) {
            System.out.println(employee + ": " + employee.getIncome() + " руб. в год");
        }
    }
}
