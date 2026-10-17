package ru.mirea.pr4.seasons;

public enum Season {
    WINTER(-10), SPRING(8), SUMMER(22) {
        @Override
        public String getDescription() { return "Теплое время года"; }
    }, AUTUMN(7);

    private final int temperature;

    Season(int temperature) { this.temperature = temperature; }
    public int getTemperature() { return temperature; }
    public String getDescription() { return "Холодное время года"; }
}
