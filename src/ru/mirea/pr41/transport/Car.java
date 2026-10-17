package ru.mirea.pr41.transport;

public class Car extends Transport {
    public Car() { super(80, 4, 20); }
    @Override
    public String getName() { return "Автомобиль"; }
}
