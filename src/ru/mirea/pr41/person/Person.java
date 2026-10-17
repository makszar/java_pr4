package ru.mirea.pr41.person;

public class Person {
    private String fullName;
    private int age;

    public Person() { this("Неизвестный", 0); }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public void move() { System.out.println(fullName + " двигается"); }
    public void talk() { System.out.println(fullName + " говорит"); }
}
