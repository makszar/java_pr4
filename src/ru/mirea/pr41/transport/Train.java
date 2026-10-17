package ru.mirea.pr41.transport;

public class Train extends Transport {
    public Train() { super(100, 2, 5); }
    @Override
    public String getName() { return "Поезд"; }
}
