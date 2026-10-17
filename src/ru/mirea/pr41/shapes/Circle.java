package ru.mirea.pr41.shapes;

public class Circle extends Shape {
    protected double radius;

    public Circle() { this(1); }
    public Circle(double radius) { this(radius, "red", true); }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
    @Override
    public String getType() { return "Круг"; }

    @Override
    public String toString() { return "Circle[radius=" + radius + ", " + super.toString() + "]"; }
}
