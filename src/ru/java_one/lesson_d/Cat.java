package ru.java_one.lesson_d;

public class Cat {
    private static final int CURRENT_YEAR = 2020;
    private String name;
    private String color;
    private final int birthDate;
    private Cat parent;
    public static int pawsAmount = 4;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return CURRENT_YEAR - birthDate;
    }

    private Cat() {
        this.birthDate = CURRENT_YEAR;
    }

    public Cat(String name, String color, int birthDate) {
        this.name = name;
        this.color = color;
        this.birthDate = birthDate;
    }

    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
        jump();
    }

    public static void voice() {
        System.out.println("Cat meows");
    }

    public void jump() {
        if (this.getAge() > 5) return;
        System.out.println(this.name + " jumps");
    }
}
