package ru.java_one.lesson_e.homework_e;

public class Cat_b extends Animal_b {
    private  float MAX_RUN_METERS;
    private float MAX_JUMP_METERS;

    public Cat_b(String name, String color, byte age, float MAX_RUN, float MAX_JUMP_METERS){
        super(name,color,age,MAX_RUN,MAX_JUMP_METERS);
    }
    //КОШКА ПЛАВАТЬ НЕ УМЕЕТ
    public  float  swim(float obstacleLength){
        if(obstacleLength > 0 && obstacleLength <= this.getMAX_SWIM_METERS()) return obstacleLength;
        return this.getMAX_SWIM_METERS() ;
    }
}
