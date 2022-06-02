package ru.java_one.lesson_e.homework_e.home_work_on_mistakes;

public class Cat extends Animal{

    Cat(String name, float maxJump, float maxRun, float maxSwim) {
        super("Cat", name, maxJump, maxRun, maxSwim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_WTF;
    }
}
