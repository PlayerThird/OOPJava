package Hm32.Hm3;

import java.util.Random;

public class Freelancer extends Employee {
    private double salarDay;
    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
        this.salarDay = salary;
    }

    @Override
    public double calculateSallary() {
        Random random = new Random();
        int days = random.nextInt(30);
        int hours = random.nextInt(1,25);
        return days * hours * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s ;Freeлансер; Зарплата в час = %.2f Среднемесячная оплата(дни*часы) %.2f", name, surName,salarDay, salary);
    }
}