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
public abstract class Animal {
    protected String name;
    protected String color;
    protected byte age;

    public Animal(String name, String color, byte age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int obstacleLength );
    public abstract void swim(int obstacleLength);
    public abstract void jumpOverObstacles(float height);

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
}
