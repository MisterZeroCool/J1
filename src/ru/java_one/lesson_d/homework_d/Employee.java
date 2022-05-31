package ru.java_one.lesson_d.homework_d;
//Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
//Конструктор класса должен заполнять эти поля при создании объекта;
//Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//Вывести при помощи методов из пункта 3 ФИО и должность.
public class Employee {
    private static int count = 0;
    public int id;
    private String first_name;
    private String position;
    private int salary;
    private int age;

    public Employee() {
    }

    public Employee(String first_name, int age, int salary) {
        this.first_name = first_name;
        this.age = age;
        this.salary = salary;
        id = ++count;
    }

    public Employee(String first_name, String position, int salary, int age) {
        this.first_name = first_name;
        this.position = position;
        this.salary = salary;
        this.age = age;
        id = ++count;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int toRaiseWages(int agePerson,int increaseSalary){
        if(age > agePerson){
            return salary+=increaseSalary;
        }return salary;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
