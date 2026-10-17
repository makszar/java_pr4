package ru.mirea.pr41.abstractshapes;

public class Square extends Rectangle {
    public Square() { this(1); }
    public Square(double side) { this(side, "red", true); }
    public Square(double side, String color, boolean filled) { super(side, side, color, filled); }
    public double getSide() { return width; }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) { setSide(side); }
    @Override
    public void setLength(double side) { setSide(side); }

    @Override
    public String toString() { return "Square[" + super.toString() + "]"; }
}
