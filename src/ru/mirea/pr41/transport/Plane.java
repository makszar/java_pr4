package ru.mirea.pr41.transport;

public class Plane extends Transport {
    public Plane() { super(800, 8, 50); }
    @Override
    public String getName() { return "Самолет"; }
}
