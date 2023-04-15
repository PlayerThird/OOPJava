package Sem1.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Product product1 = new Product();
//        product1.name = "Бутыль";
//        product1.brand = "Жумайсынба";
//        product1.price = 100.45;

        Product product2 = new Product("Бутылище", 200);// исп. конструктор с параметрами
        Product product3 = new Product();// используем конструктор "по умолчанию" заполнявший все переменные
        Product product4 = new Product("Источник","Бутылище", 200);
        System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());
        System.out.println("pr3 "+product3.displayInfo());
        System.out.println(product4.displayInfo());

//        product3.setPrice(-30);
//        product3.name = "_____";
//        product3.price = -30;
//        System.out.println("pr3 "+product3.displayInfo());

        BottleOfWhater bottleOfWhater1 = new BottleOfWhater("Вода1",100,20);
        System.out.println(bottleOfWhater1.displayInfo());

        BottleOfWhater bottleOfWhater2 = new BottleOfWhater("Вода2",100,5);
        BottleOfWhater bottleOfWhater3 = new BottleOfWhater("Вода3",100,10);
        BottleOfWhater bottleOfWhater4 = new BottleOfWhater("Вода4",100,20);

        Product bottleOfWhater5 = new BottleOfWhater("Cola",110,5);
        Product bottleOfMilk1 = new BottleOfMilk("Milk",110,5,6);
        List<Product> products = new ArrayList<>();
        //т.к. список из типов Продукт, сюда спойкойно идут бутылки с водой, т.к. они объявлены типа Продукт
        products.add(bottleOfMilk1);
        products.add(bottleOfWhater1);
        products.add(bottleOfWhater2);
        products.add(bottleOfWhater3);
        products.add(bottleOfWhater4);
        products.add(bottleOfWhater5);

        WendingMachine machine = new WendingMachine(products);
        machine.getBottleOfWhater("Вода",2);
        if (machine != null && machine.getBottleOfWhater("Вода",2) != null){
            System.out.println("Вы купили");
            System.out.println(machine.getBottleOfWhater("Вода",2));
        }else {
            System.out.println("Такой бутылки с водой нет в автомате");
        }
    }
}
