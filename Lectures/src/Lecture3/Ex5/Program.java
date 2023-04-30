package Lecture3.Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random r = new Random();
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(r.nextInt(1, 20));
//        }
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

        List<Worker> db = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db.add(new Worker("Имя" + i, "Фамилия" + i, r.nextInt(18, 30), r.nextInt(10000)));
        }
        System.out.println(db);
        db.sort((w1,w2) -> Integer.compare(w1.salary, w2.salary));//или же с помощью стандартной сортировки
        // на месте обозначаем по какому критерию будет сортироватся(не нужно описывать лишний класс или имплемитировать интерфейсы)
//        db.sort(new SalaryComporator());//сортируем либо так
//        Collections.sort(db);// либо так
        System.out.println(db);
    }
}