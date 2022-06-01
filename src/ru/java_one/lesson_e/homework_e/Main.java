package ru.java_one.lesson_e.homework_e;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog("Spake","black", (byte) 5),
                new Cat("Clara", "white", (byte) 1),
                new Horse("Arrow", "black", (byte) 2 ),
                new Bird("Chijik", "yellow", (byte) 1)
        };
        for(Animal e : zoo) {
            e.run(50);
            e.swim(10);
            e.jumpOverObstacles(5);
            System.out.println(e.name);
        }

        Animal_b[] zoo_1 ={
                new Dog_b("Spake","black", (byte) 5,500,0.5f,10 ),
                new Dog_b("Puff","white", (byte) 4,600,1,8 ),
                new Cat_b("Carla","white", (byte) 3,200,2)
        };
        for(Animal_b e : zoo_1) {
            System.out.println(e.getName() + " пробежала "+e.run(1000)+ " м!");
            System.out.println(e.getName() + " прыгнула "+e.jumpOverObstacles(1000)+ " м!");
            System.out.println(e.getName() + " проплыла "+e.swim(1000)+ " м!");

        }

    }
}
