package ru.mirea.pr41.learners;

public class TestLearner {
    public static void main(String[] args) {
        Learner[] learners = {new Student("Максим"), new Schoolchild("Иван"),
                new Student("Анна"), new Schoolchild("Мария")};
        System.out.println("Студенты:");
        for (Learner learner : learners) {
            if (learner instanceof Student) { System.out.println(learner.getName()); }
        }
        System.out.println("Школьники:");
        for (Learner learner : learners) {
            if (learner instanceof Schoolchild) { System.out.println(learner.getName()); }
        }
    }
}
