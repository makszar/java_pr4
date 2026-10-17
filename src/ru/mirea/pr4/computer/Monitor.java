package ru.mirea.pr4.computer;

public class Monitor {
    private final double diagonal;
    private final int width;
    private final int height;

    public Monitor(double diagonal, int width, int height) {
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
    }

    public double getDiagonal() { return diagonal; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public String toString() {
        return "Monitor[" + diagonal + ", " + width + ", " + height + "]";
    }
}
