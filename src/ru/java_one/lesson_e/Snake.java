package ru.java_one.lesson_e;

public class Snake extends Animal {
    public Snake(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " shshshshshssshhhh");
    }

    @Override
    public void move() {
        System.out.println(name + " crawls");
    }
}
