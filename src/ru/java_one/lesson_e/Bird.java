package ru.java_one.lesson_e;

public class Bird extends Animal {

    final int flyHeight;

    public Bird(String name, String color, int age, int flyHeight) {
        super(name, color, age);
        this.flyHeight = flyHeight;
    }

    @Override
    public void voice() {
        System.out.println(this.name + " tweets");
    }

}
