package ru.mirea.pr4.atelier;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) { super(size, price, color); }
    @Override
    public void dressMan() { System.out.println(this); }
    @Override
    public void dressWomen() { System.out.println(this); }
}
