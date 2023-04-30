package Hm32.Hm3;

public class Worker extends Employee {

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