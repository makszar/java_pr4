package ru.mirea.pr4.atelier;

public class Atelier {
    public void dressMan(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = {new TShirt(Size.XXS, 900, "белый"), new Pants(Size.M, 3000, "черный"),
                new Skirt(Size.S, 2000, "синий"), new Tie(Size.L, 700, "серый")};
        Atelier atelier = new Atelier();
        System.out.println("Мужская одежда:");
        atelier.dressMan(clothes);
        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);
    }
}
