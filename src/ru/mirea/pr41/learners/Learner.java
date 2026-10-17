package ru.mirea.pr41.learners;

public class Learner {
    private final String name;

    public Learner(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Learner[" + name + "]";
    }
}
