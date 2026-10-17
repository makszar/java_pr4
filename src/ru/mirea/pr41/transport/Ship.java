package ru.mirea.pr41.transport;

public class Ship extends Transport {
    public Ship() { super(40, 1.5, 2); }
    @Override
    public String getName() { return "Корабль"; }
}
