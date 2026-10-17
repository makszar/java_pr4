package ru.mirea.pr41.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() { this("", ""); }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() { return number; }
    public String getModel() { return model; }
    public double getWeight() { return weight; }
    public void receiveCall(String name) { System.out.println("Звонит " + name); }
    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + ", " + number);
    }
    public void sendMessage(String... numbers) {
        for (String recipient : numbers) { System.out.println("Сообщение для " + recipient); }
    }
    @Override
    public String toString() { return number + ", " + model + ", " + weight + " г"; }
}
