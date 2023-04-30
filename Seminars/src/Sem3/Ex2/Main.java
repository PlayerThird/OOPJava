package Sem3.Ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    /**
     * TODO: generateEmployee должен создавать различных сотрудников(Worker, Freelancer)
      * @return
     */

    static Worker generateEmployee(){
        String[] names = new String[]{"Анатолий","Ivan"};
        String[] surNames = new String[]{"Sergeevich","Ivanovich"};
        int salary = random.nextInt(200,300);
        int index = random.nextInt(30,50);
/**
 * Изменить рандом для фамилий/имён и добавить их
 */
        return new Worker(names[random.nextInt(2)], surNames[random.nextInt(2)], salary*index);
    }

    public static void main(String[] args) {

        Worker worker = new Worker("Саня", "Cool", 80000);
        System.out.println(worker);
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }

//        Arrays.sort(employees, new SallaryComporator());//или так
        Arrays.sort(employees);//или так
        System.out.println("--------------");

        for (Employee emp : employees) {
            System.out.println(emp);
        }




    }
}

class SallaryComporator implements Comparator<Employee> {//будем сравнивать тип Employee

    @Override
    public int compare(Employee o1, Employee o2) {//чтобы по убыванию сортировку, просто поменять местами o1 и o2 в return
        // 1 o1 > o2
        // 0 o1 == o2
        // -1 o1 < o2
//        if (o1.salary>o2.salary) return 1;
//        else if (o1.salary == o2.salary)return 0;
//        else if (o1.salary < o2.salary)return -1;
        //или
//        return o1.calculateSallary() == o2.calculateSallary() ? 0:(o1.calculateSallary()>o2.calculateSallary())

        return Double.compare(o1.calculateSallary(), o2.calculateSallary());//работает так же, как пример выше
    }

    class NameComporator implements Comparator<Employee> {//будем сравнивать тип Employee

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }


    }
}
abstract class Employee implements Comparable<Employee>{//для сортировки


    protected String name;
    protected String surName;
    protected double salary;

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s ; Среднемесячная оплата %.2f", name, surName, salary);
    }

    public abstract double calculateSallary();

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSallary(),o.calculateSallary());
    }
}

class Worker extends Employee {

    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSallary() {
        return salary;
        //TODO: Для фрилансера - return 20 * 6 * salary. дни * часы * зарплата
    }

    @Override
    public String toString() {
        return String.format("%s %s ;Рабочий; Среднемесячная оплата(фиксированная) %.2f", name, surName, salary);
    }
}


/**
 * TODO: Доработать самост в рамках дз
 */
class Freelancer extends Employee {
    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSallary() {

        return 20 * 6 * salary;
    }

}