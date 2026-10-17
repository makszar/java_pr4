package ru.mirea.pr4.atelier;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) { super(size, price, color); }
    @Override
    public void dressMan() { System.out.println(this); }
}
