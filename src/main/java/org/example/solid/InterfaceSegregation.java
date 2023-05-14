package org.example.solid;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Workable human = new Human();
        human.work();
        ((Human) human).eat();
        ((Human) human).sleep();

        Workable robotWorker = new Robot();
        robotWorker.work();
    }

}
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Human implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Robot implements Workable {
    @Override
    public void work() {
        System.out.println("Working...");
    }
}
