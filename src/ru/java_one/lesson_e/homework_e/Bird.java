package ru.java_one.lesson_e.homework_e;

public class Bird extends Animal {
    private static final int MAX_RUN_METERS = 5;
    private static final float MAX_JUMP_METERS = 0.2f;
    //ПЛАВАТЬ НЕ УМЕЕТ

    public Bird(String name, String color, byte age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= MAX_RUN_METERS){
            System.out.println("Птичка пробежала " + obstacleLength + " м!");
        }else System.out.println("Птичка стоит на месте!");
    }

    @Override
    public void swim(int swimLength) {
        System.out.println("Птичка плавать не умеет");
    }

    @Override
    public void jumpOverObstacles(float jumpHeight) {
        if(jumpHeight > 0 && jumpHeight <= MAX_JUMP_METERS){
            System.out.println("Птичка подпрыгнула на " + jumpHeight + " м!");
        }else System.out.println("Птичка не хочет прыгать");
    }
}
