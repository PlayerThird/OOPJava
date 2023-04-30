package Lecture3.Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();//объявляем итератор
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Worker worker = new Worker("Imja","Familia",23,6356);
//        Iterator<Objects> components = worker.iterator();//не будет так работать см. пример ниже




    }

}
