package ru.java_one.lesson_e;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barsik", "Black", 2);
        Dog d = new Dog("Tuzik", "White", 5);
        Bird b =  new Bird("Chijik", "yellow", 3, 10);
        Parrot p = new Parrot("Polly", "rainbow", 1, 5);
        Snake s = new Snake("Kaa", "Brown", 20);

        Animal[] zoo = {c, d, b, p, s};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].move();
            zoo[i].voice();
            System.out.println(zoo[i].getClass().getName());
            System.out.println("-------------------------------------------------------------------------");
            if (zoo[i] instanceof Parrot) {
                ((Parrot) zoo[i]).speak();
            }
        }

    }
}
