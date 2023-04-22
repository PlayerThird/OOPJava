package Hm3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();

    /**
     * TODO: generateEmployee должен создавать различных сотрудников(Worker, Freelancer)
     *
     * @return
     */

    static Employee generateEmployee() {
        String[] names = new String[]{"Филипп", "Артём", "Лука", "Георгий", "Александр", "Мирон", "Максим", "Али", "Елисей", "Марк"};
        String[] surNames = new String[]{"Тихонов", "Соколов", "Федотов", "Морозов", "Миронов", "Давыдов", "Карпов", "Молчанов", "Афанасьев", "Гордеев"};
        int salary = random.nextInt(200, 300);
        int index = random.nextInt(30, 50);
        if(random.nextInt(2)==0) return new Freelancer(names[random.nextInt(10)], surNames[random.nextInt(10)], salary * index);
        else return new Worker(names[random.nextInt(10)], surNames[random.nextInt(10)], salary * index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }

        for (Employee emp : employees) {
            System.out.println(emp);
        }
        System.out.println("Выберите сортировку: \n" +
                "1)По зарплате\n" +
                "2)По имени\n" +
                "3)По фамилии");
        Employee.setNumber(sc.nextInt());
//        Arrays.sort(employees);

        System.out.println("--------------");

        for (Employee emp : employees) {
            System.out.println(emp);
        }


    }
}


/**
 * TODO: Доработать самост в рамках дз
 */
