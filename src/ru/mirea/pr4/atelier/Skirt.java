package ru.mirea.pr4.atelier;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) { super(size, price, color); }
    @Override
    public void dressWomen() { System.out.println(this); }
}
