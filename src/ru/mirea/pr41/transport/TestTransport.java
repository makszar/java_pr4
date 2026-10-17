package ru.mirea.pr41.transport;

public class TestTransport {
    public static void main(String[] args) {
        Transport[] vehicles = {new Car(), new Plane(), new Train(), new Ship()};
        double distance = 1000;
        int passengers = 3;
        double tons = 2;
        for (Transport vehicle : vehicles) {
            System.out.println(vehicle.getName());
            System.out.printf("Время: %.2f ч%n", vehicle.travelTime(distance));
            System.out.printf("Пассажиры: %.2f руб.%n", vehicle.passengerCost(distance, passengers));
            System.out.printf("Груз: %.2f руб.%n", vehicle.cargoCost(distance, tons));
        }
    }
}
