package ru.mirea.pr41.person;

public class TestPerson {
    public static void main(String[] args) {
        Person[] people = {new Person(), new Person("Зарубин Максим", 20)};
        for (Person person : people) {
            person.move();
            person.talk();
        }
    }
}
