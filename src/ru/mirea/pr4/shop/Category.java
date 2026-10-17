package ru.mirea.pr4.shop;

public enum Category {
    BOOKS("Книги"), ELECTRONICS("Электроника"), CLOTHES("Одежда");
    private final String title;
    Category(String title) { this.title = title; }
    @Override
    public String toString() { return title; }
}
