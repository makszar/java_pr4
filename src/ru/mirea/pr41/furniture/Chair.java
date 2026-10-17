package ru.mirea.pr41.furniture;

public class Chair extends Furniture {
    public Chair(String material, double price) { super(material, price); }
    @Override
    public String getType() { return "Стул"; }
}
