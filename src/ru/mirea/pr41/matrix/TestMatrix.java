package ru.mirea.pr41.matrix;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix a = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix b = new Matrix(new double[][]{{5, 6}, {7, 8}});
        System.out.println("Сумма:");
        a.add(b).print();
        System.out.println("Умножение на 2:");
        a.multiply(2).print();
        System.out.println("Произведение:");
        a.multiply(b).print();
    }
}
