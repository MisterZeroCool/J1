package ru.java_one.lesson_e.homework_e;

public class Cat extends Animal {
    private static final int MAX_RUN_METERS = 200;
    private static final int MAX_JUMP_METERS = 2;
    //КОШКА ПЛАВАТЬ НЕ УМЕЕТ

    public Cat(String name, String color, byte age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= MAX_RUN_METERS){
            System.out.println("Кошка по кличке " + getName() +" пробежала " + obstacleLength + " м!");
        }else System.out.println("Кошка спит!");
    }

    @Override
    public void swim(int obstacleLength) {
        System.out.println("Кошка плавать не умеет!");
    }

    @Override
    public void jumpOverObstacles(float jumpHeight) {
        if(jumpHeight > 0 && jumpHeight <= MAX_JUMP_METERS){
            System.out.println("Кошка по кличке " + getName() +" подпрыгнула на " + jumpHeight + " м!");
        }else System.out.println("Кошка не хочет прыгать");
    }
}
