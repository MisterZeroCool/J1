package ru.java_one.lesson_d.homework_d;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jax","cleaner", 58000, 45);
        Employee employee_1 = new Employee("Jax","director", 100000, 35);
        Employee employee_2 = new Employee("Jax","administrator", 50000, 23);

        System.out.println(employee.getFirst_name() +": "+ employee.getPosition());
        System.out.println(employee_1.getFirst_name() +": "+ employee_1.getPosition());
        System.out.println(employee_2.getFirst_name() +": "+employee_2.getPosition());

//        Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        int size = 5;
        Employee[] arrEmployees = new Employee[size];
        arrEmployees[0] = new Employee("Jax", 22,50000);
        arrEmployees[1] = new Employee("Alex", 35, 30000);
        arrEmployees[2] = new Employee("Wescer", 57,45000);
        arrEmployees[3] = new Employee("Fox", 24, 60000);
        arrEmployees[4] = new Employee("Eric", 45, 88000);

        int agePerson = 40;
        int increaseSalary = 5000;
        for(int i = 0; i < arrEmployees.length; i++) {
            if(arrEmployees[i].getAge() > agePerson){
                arrEmployees[i].toRaiseWages(agePerson, increaseSalary);
                System.out.println(arrEmployees[i].getFirst_name()+": "+ arrEmployees[i].getAge()+" age , salary: "+ arrEmployees[i].getSalary() );
            }
        }
    }
}
