package ru.mirea.pr41.library;

import java.time.LocalDate;

public class Reader {
    private final String fullName;
    private final int cardNumber;
    private final String faculty;
    private final LocalDate birthDate;
    private final String phone;

    public Reader(String fullName, int cardNumber, String faculty, LocalDate birthDate, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int count) { System.out.println(fullName + " взял " + count + " " + bookWord(count)); }
    public void returnBook(int count) { System.out.println(fullName + " вернул " + count + " " + bookWord(count)); }
    public void takeBook(String... names) { System.out.println(fullName + " взял книги: " + String.join(", ", names)); }
    public void returnBook(String... names) { System.out.println(fullName + " вернул книги: " + String.join(", ", names)); }

    public void takeBook(Book... books) { takeBook(namesOf(books)); }
    public void returnBook(Book... books) { returnBook(namesOf(books)); }

    private String[] namesOf(Book[] books) {
        String[] names = new String[books.length];
        for (int i = 0; i < books.length; i++) { names[i] = books[i].getName(); }
        return names;
    }

    private String bookWord(int count) {
        int lastTwo = Math.abs(count % 100);
        int last = Math.abs(count % 10);
        if (lastTwo >= 11 && lastTwo <= 14) { return "книг"; }
        if (last == 1) { return "книгу"; }
        if (last >= 2 && last <= 4) { return "книги"; }
        return "книг";
    }

    @Override
    public String toString() {
        return fullName + ", билет " + cardNumber + ", " + faculty + ", " + birthDate + ", " + phone;
    }
}
