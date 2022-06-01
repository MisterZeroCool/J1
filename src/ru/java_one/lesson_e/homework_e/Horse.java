package ru.java_one.lesson_e.homework_e;

public class Horse extends Animal {
    private static final int MAX_RUN_METERS = 1500;
    private static final int MAX_JUMP_METERS = 3;
    private static final int MAX_SWIM_METERS = 100;
    public Horse(String name, String color, byte age) {
        super(name, color, age);
    }

    @Override
    public void run(int obstacleLength) {
        if(obstacleLength > 0 && obstacleLength <= MAX_RUN_METERS){
            System.out.println("Лошадь по кличке " + getName() +" пробежала " + obstacleLength + " м!");
        }else System.out.println("Лошадь стоит на месте и кушает травку!");
    }


    @Override
    public void swim(int swimLength) {
        if(swimLength >= 1 && swimLength <= MAX_SWIM_METERS) {
            System.out.println("Лошадь по кличке " + getName() +" проплыла " + swimLength + " м!");
        }else System.out.println("Лошадь никуда не плывет!");
    }

    @Override
    public void jumpOverObstacles(float jumpHeight) {
            if(jumpHeight > 0 && jumpHeight <= MAX_JUMP_METERS){
                System.out.println("Лошадь по кличке " + getName() +" подпрыгнула на " + jumpHeight + " м!");
            }else System.out.println("Лошадь не хочет прыгать");
    }
}
