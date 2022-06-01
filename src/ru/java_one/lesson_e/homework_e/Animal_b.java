package ru.java_one.lesson_e.homework_e;
//1.Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.          +
//
//        2.Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве
//        параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков). +
//
//        3.У каждого животного есть ограничения на действия
//        (бег: кот 200 м., собака 500 м., Лошадь 1500 м.,Птица 5 м.,;
//        прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
//        плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.). +
//
//        4.При попытке животного выполнить одно из этих действий, оно должно сообщить результат. (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//
//        5.Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
public abstract class Animal_b {
    protected float MAX_RUN;
    protected float MAX_JUMP_METERS;
    protected float MAX_SWIM_METERS;
    protected String name;
    protected String color;
    protected byte age;

    public Animal_b(){}

    public Animal_b(String name, String color, byte age, float MAX_RUN, float MAX_JUMP_METERS, float MAX_SWIM_METERS ){
        this.name = name;
        this.color = color;
        this.age = age;
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP_METERS = MAX_JUMP_METERS;
        this.MAX_SWIM_METERS = MAX_SWIM_METERS;
    }

    public Animal_b(String name, String color, byte age, float MAX_RUN, float MAX_JUMP_METERS ){
        this.name = name;
        this.color = color;
        this.age = age;
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP_METERS = MAX_JUMP_METERS;
    }

    public float run(float obstacleLength ) {
        if(obstacleLength > 0 && obstacleLength <= this.getMAX_RUN()) return obstacleLength;
        return this.getMAX_RUN() ;
    }
    public  float  swim(float obstacleLength){
        if(obstacleLength > 0 && obstacleLength <= this.getMAX_SWIM_METERS()) return obstacleLength;
        return this.getMAX_SWIM_METERS() ;
    }

    public  float jumpOverObstacles(float jumpHeight){
        if(jumpHeight > 0 && jumpHeight <= this.getMAX_JUMP_METERS()) return jumpHeight;
        return this.getMAX_JUMP_METERS() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getMAX_RUN() {
        return MAX_RUN;
    }

    public float getMAX_JUMP_METERS() {
        return MAX_JUMP_METERS;
    }

    public float getMAX_SWIM_METERS() {
        return MAX_SWIM_METERS;
    }


}
