package ru.mirea.pr41.furniture;

public class Wardrobe extends Furniture {
    public Wardrobe(String material, double price) { super(material, price); }
    @Override
    public String getType() { return "Шкаф"; }
}
