package ru.java_one.lesson_e.homework_e;

public class Dog_b extends Animal_b {
    private float MAX_RUN_METERS;
    private float MAX_JUMP_METERS;
    private float MAX_SWIM_METERS;

    public Dog_b(String name, String color, byte age, float MAX_RUN, float MAX_JUMP_METERS, float MAX_SWIM_METERS){
        super(name,color,age,MAX_RUN,MAX_JUMP_METERS, MAX_SWIM_METERS);
    }
}
