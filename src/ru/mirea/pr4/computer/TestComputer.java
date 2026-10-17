package ru.mirea.pr4.computer;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer(Brand.ASUS, new Processor("Ryzen 5", 6, 3.6),
                new Memory(16, 3200), new Monitor(24, 1920, 1080));
        System.out.println(computer);
        System.out.println("Ядер: " + computer.getProcessor().getCores());
        System.out.println("ОЗУ: " + computer.getMemory().getGigabytes() + " ГБ");
        System.out.println("Диагональ: " + computer.getMonitor().getDiagonal());
    }
}
