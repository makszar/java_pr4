package ru.mirea.pr4.seasons;

public class TestSeason {
    public static void love(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println(favorite + ", " + favorite.getTemperature() + ", " + favorite.getDescription());
        love(favorite);
        for (Season season : Season.values()) {
            System.out.println(season + ", " + season.getTemperature() + ", " + season.getDescription());
        }
    }
}
