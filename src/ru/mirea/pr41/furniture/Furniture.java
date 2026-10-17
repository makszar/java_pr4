package ru.mirea.pr41.furniture;

public abstract class Furniture {
    private final String material;
    private final double price;

    public Furniture(String material, double price) {
        this.material = material;
        this.price = price;
    }
    public String getMaterial() { return material; }
    public double getPrice() { return price; }
    public abstract String getType();
    @Override
    public String toString() { return getType() + ", " + material + ", " + price + " руб."; }
}
