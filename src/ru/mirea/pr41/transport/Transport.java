package ru.mirea.pr41.transport;

public abstract class Transport {
    private final double speed;
    private final double passengerRate;
    private final double cargoRate;

    public Transport(double speed, double passengerRate, double cargoRate) {
        if (speed <= 0 || passengerRate < 0 || cargoRate < 0) {
            throw new IllegalArgumentException("Некорректная скорость или тариф");
        }
        this.speed = speed;
        this.passengerRate = passengerRate;
        this.cargoRate = cargoRate;
    }

    public double travelTime(double distance) { return distance / speed; }
    public double passengerCost(double distance, int passengers) { return distance * passengers * passengerRate; }
    public double cargoCost(double distance, double tons) { return distance * tons * cargoRate; }
    public abstract String getName();
}
