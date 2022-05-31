package ru.java_one.lesson_e;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " meows");
    }

}
