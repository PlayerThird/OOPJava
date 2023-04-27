package Hm4;

import java.util.ArrayList;


public class HmW4 {


    public static void CompareBoxes(Box<Fruit> o1, Box<Fruit> o2) {
        if (o1.compareTo(o2) == 1) {
            System.out.println("Первый ящик больше");
        } else if (o1.compareTo(o2) == 0) {
            System.out.println("Ящики равны");
        } else if (o1.compareTo(o2) == -1) {
            System.out.println("Второй ящик больше");
        }
    }

    public static void main(String[] args) {
        Box<Fruit> orangeBox = new Box<>(GenerateFruit("Orange", 2), "orangeBox");
        System.out.println(orangeBox);

        Box<Fruit> appStore = new Box<>(GenerateFruit("Apple", 20), "appStore");
        System.out.println(appStore);

        Box<Fruit> orangeBox2 = new Box<>(GenerateFruit("Orange", 1), "orangeBox2");
        System.out.println(orangeBox2);

        Box<Fruit> appStore2 = new Box<>(GenerateFruit("Apple", 1), "appStore2");
        System.out.println(appStore2);

        System.out.println(orangeBox.compareTo(appStore));
        ArrayList<Box> manyBoxes = new ArrayList<>();
        manyBoxes.add(orangeBox);
        manyBoxes.add(appStore);
        manyBoxes.add(orangeBox2);
        manyBoxes.add(appStore2);

        System.out.println(manyBoxes.get(0).getNameBox());
        System.out.println(Viewer.ShowBox(manyBoxes.get(0)));
        CompareBoxes(appStore2, orangeBox2);

    }

    private static ArrayList<Fruit> GenerateFruit(String name, int col) {
        ArrayList<Fruit> listOfFruit = new ArrayList<>();
        switch (name) {
            case "Apple": {
                for (int i = 0; i < col; i++) {
                    listOfFruit.add(new Orange());
                }
            }
            case "Orange": {
                for (int i = 0; i < col; i++) {
                    listOfFruit.add(new Orange());
                }
            }
        }
        return listOfFruit;
    }
}







