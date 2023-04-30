package Lecture3.Ex3;

import Lecture3.Ex3.Napitok.*;

import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(12);
//        nums.add(123);
//        nums.add(1234);
//        nums.add(12345);
//
//        Iterator<Integer> iter = nums.iterator();//объявляем итератор
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//        Worker worker = new Worker("Imja","Familia",23,6356);
//Iterator<String> components = worker;//привели воркера напрямую к итератору
//        //он спокойно привёлся к типу итератор т.к. в классе мы его имплементировали
//        while (components.hasNext()){
//            System.out.println(worker.next());
//        }

        Beverage latte = new Cofee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
