package ru.mirea.pr41.furniture;

public class Table extends Furniture {
    public Table(String material, double price) { super(material, price); }
    @Override
    public String getType() { return "Стол"; }
}
