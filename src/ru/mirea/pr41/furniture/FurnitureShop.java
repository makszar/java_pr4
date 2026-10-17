package ru.mirea.pr41.furniture;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private final List<Furniture> items = new ArrayList<>();

    public void add(Furniture furniture) { items.add(furniture); }
    public void printCatalog() {
        for (Furniture item : items) { System.out.println(item); }
    }
    public Furniture buy(int index) { return items.remove(index); }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        shop.add(new Chair("дерево", 2500));
        shop.add(new Table("дерево", 8000));
        shop.add(new Wardrobe("МДФ", 15000));
        shop.printCatalog();
        System.out.println("Куплен: " + shop.buy(0));
        System.out.println("Осталось в магазине:");
        shop.printCatalog();
    }
}
