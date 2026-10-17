package ru.mirea.pr4.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private final List<Product> products = new ArrayList<>();
    private final List<Product> cart = new ArrayList<>();
    private final Scanner scanner;

    public Shop(Scanner scanner) {
        this.scanner = scanner;
        products.add(new Product("Java для начинающих", 900, Category.BOOKS));
        products.add(new Product("Алгоритмы", 1200, Category.BOOKS));
        products.add(new Product("Мышь", 1500, Category.ELECTRONICS));
        products.add(new Product("Клавиатура", 3000, Category.ELECTRONICS));
        products.add(new Product("Футболка", 800, Category.CLOTHES));
    }

    private int readNumber() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public void run() {
        System.out.println("Учебный вход: student / java");
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();
        if (!login.equals("student") || !password.equals("java")) {
            System.out.println("Неверный логин или пароль");
            return;
        }
        while (true) {
            System.out.println("1. Каталоги  2. Корзина  3. Купить  0. Выход");
            int choice = readNumber();
            switch (choice) {
                case 1: chooseProduct(); break;
                case 2: showCart(); break;
                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Корзина пуста");
                    } else {
                        showCart();
                        cart.clear();
                        System.out.println("Покупка оформлена");
                    }
                    break;
                case 0: return;
                default: System.out.println("Нет такого пункта");
            }
        }
    }

    private void chooseProduct() {
        Category[] categories = Category.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }
        int categoryIndex = readNumber() - 1;
        if (categoryIndex < 0 || categoryIndex >= categories.length) {
            System.out.println("Нет такого каталога");
            return;
        }
        List<Product> selected = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory() == categories[categoryIndex]) {
                selected.add(product);
                System.out.println(selected.size() + ". " + product);
            }
        }
        System.out.println("Номер товара для добавления, 0 для возврата:");
        int index = readNumber() - 1;
        if (index == -1) { return; }
        if (index < 0 || index >= selected.size()) {
            System.out.println("Нет такого товара");
            return;
        }
        cart.add(selected.get(index));
        System.out.println("Товар добавлен в корзину");
    }

    private void showCart() {
        double total = 0;
        for (Product product : cart) {
            System.out.println(product);
            total += product.getPrice();
        }
        System.out.println("Итого: " + total + " руб.");
    }

    public static void main(String[] args) {
        new Shop(new Scanner(System.in)).run();
    }
}
