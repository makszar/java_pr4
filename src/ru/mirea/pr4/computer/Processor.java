package ru.mirea.pr4.computer;

public class Processor {
    private final String model;
    private final int cores;
    private final double frequency;

    public Processor(String model, int cores, double frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getModel() { return model; }
    public int getCores() { return cores; }
    public double getFrequency() { return frequency; }

    @Override
    public String toString() {
        return "Processor[" + model + ", " + cores + ", " + frequency + "]";
    }
}
