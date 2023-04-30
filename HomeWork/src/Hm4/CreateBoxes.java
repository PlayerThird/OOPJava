package Hm4;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateBoxes {
    public static ArrayList<Box<Fruit>> CreateFruits(){
        ArrayList<Box<Fruit>> manyBoxes= new ArrayList<>();
        Box<Fruit> orangeBox = new Box<>(GenerateFruit("Orange", 2), "orangeBox");
        System.out.println(orangeBox);

        Box<Fruit> appStore = new Box<>(GenerateFruit("Apple", 20), "appStore");
        System.out.println(appStore);

        Box<Fruit> orangeBox2 = new Box<>(GenerateFruit("Orange", 1), "orangeBox2");
        System.out.println(orangeBox2);

        Box<Fruit> appStore2 = new Box<>(GenerateFruit("Apple", 1), "appStore2");
        System.out.println(appStore2);
        manyBoxes.add(orangeBox);
        manyBoxes.add(appStore);
        manyBoxes.add(orangeBox2);
        manyBoxes.add(appStore2);
        return manyBoxes;
    }
    private static ArrayList<Fruit> GenerateFruit(String name, int col) {
        ArrayList<Fruit> listOfFruit = new ArrayList<>();
        switch (name) {
            case "Apple": {
                for (int i = 0; i < col; i++) {
                    listOfFruit.add(new Apple(name));
                }
            }
            case "Orange": {
                for (int i = 0; i < col; i++) {
                    listOfFruit.add(new Orange(name));
                }
            }
        }
        return listOfFruit;
    }
    public static ArrayList<Box<Fruit>> AddList(ArrayList<Box<Fruit>> manyBoxes){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип фруктов:");
        String fruitType = new Scanner(System.in).nextLine();
        System.out.println("Сколько их там будет?:");
        int amount = sc.nextInt();
        System.out.println("Введите имя коробки");
        String nameBox = new Scanner(System.in).nextLine();
        System.out.println(" ");
        manyBoxes.add(new Box<>(GenerateFruit(fruitType,amount),nameBox));
        return manyBoxes;
    }
}
