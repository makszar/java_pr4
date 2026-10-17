package ru.mirea.pr4.computer;

public class Memory {
    private final int gigabytes;
    private final int frequency;

    public Memory(int gigabytes, int frequency) {
        this.gigabytes = gigabytes;
        this.frequency = frequency;
    }

    public int getGigabytes() { return gigabytes; }
    public int getFrequency() { return frequency; }

    @Override
    public String toString() {
        return "Memory[" + gigabytes + ", " + frequency + "]";
    }
}
