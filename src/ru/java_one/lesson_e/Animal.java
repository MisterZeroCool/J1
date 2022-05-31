package ru.java_one.lesson_e;

public abstract class   Animal extends Object {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void voice();

    public void move() {
        System.out.println(this.name + " walks on paws");
    }

}
