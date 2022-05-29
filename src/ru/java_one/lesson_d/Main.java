package ru.java_one.lesson_d;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Black");

        Cat cat2 = new Cat("Murzik", "White", 1985);
//        cat2.parent = cat1;

        System.out.println("Cat: " + cat1.getName() + " of age " + cat1.getAge() + " is " + cat1.getColor());
        System.out.println("Cat: " + cat2.getName() + " of age " + cat2.getAge() + " is " + cat2.getColor());

        cat2.jump();

        Cat.voice();

        System.out.println(Cat.pawsAmount);

        cat2.pawsAmount = 7;

        System.out.println(cat1.pawsAmount);
    }
}