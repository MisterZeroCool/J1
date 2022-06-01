package ru.java_one.lesson_e.homework_e;

public class Dog extends Animal {
    private static final int MAX_RUN_METERS = 500;
    private static final float MAX_JUMP_METERS = 0.5f;
    private static final int MAX_SWIM_METERS = 10;

    public Dog(String name, String color, byte age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= MAX_RUN_METERS){
            System.out.println("Собака по кличке " + getName() +" пробежала " + obstacleLength + " м!");
        }else System.out.println("Собака стоит на месте и грызет кость!");
    }

    @Override
    public void swim(int swimLength) {
        if(swimLength >= 1 && swimLength <= MAX_SWIM_METERS) {
            System.out.println("Собака по кличке " + getName() +" проплыла " + swimLength + " м!");
        }else System.out.println("Собака никуда не плывет!");
    }

    @Override
    public void jumpOverObstacles(float jumpHeight) {
        if(jumpHeight > 0 && jumpHeight <= MAX_JUMP_METERS){
            System.out.println("Собака по кличке " + getName() +" подпрыгнула на " + jumpHeight + " м!");
        }else System.out.println("Собака не хочет прыгать");
    }
}
