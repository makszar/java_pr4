package ru.mirea.pr41.library;

import java.time.LocalDate;

public class TestReader {
    public static void main(String[] args) {
        Reader[] readers = {new Reader("Петров В. В.", 1, "ИТ", LocalDate.of(2005, 3, 12), "+79000000001"),
                new Reader("Иванова А. А.", 2, "Экономика", LocalDate.of(2006, 5, 7), "+79000000002")};
        Book[] books = {new Book("Приключения", "Автор 1"), new Book("Словарь", "Автор 2"),
                new Book("Энциклопедия", "Автор 3")};
        for (Reader reader : readers) {
            System.out.println(reader);
            reader.takeBook(3);
            reader.takeBook("Приключения", "Словарь", "Энциклопедия");
            reader.takeBook(books);
            reader.returnBook(3);
            reader.returnBook("Приключения", "Словарь", "Энциклопедия");
            reader.returnBook(books);
        }
    }
}
