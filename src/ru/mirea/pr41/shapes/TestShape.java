package ru.mirea.pr41.shapes;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        Shape s3 = new Rectangle(1, 2, "RED", false);
        Shape s4 = new Square(6.6);
        Shape[] shapes = {s1, s3, s4};
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println(shape.getColor() + ", " + shape.isFilled());
            System.out.println(shape.getType());
        }
        Circle c1 = (Circle) s1;
        Rectangle r1 = (Rectangle) s3;
        Rectangle r2 = (Rectangle) s4;
        Square sq1 = (Square) r2;
        System.out.println("Радиус: " + c1.getRadius());
        System.out.println("Длина: " + r1.getLength());
        System.out.println("Длина квадрата: " + r2.getLength());
        System.out.println("Сторона: " + sq1.getSide());
        sq1.setWidth(4);
        System.out.println("После setWidth(4): " + sq1.getWidth() + ", " + sq1.getLength());
        sq1.setLength(3);
        System.out.println("После setLength(3): " + sq1.getWidth() + ", " + sq1.getLength());
    }
}
