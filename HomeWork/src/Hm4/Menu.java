package Hm4;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void SetMenu(ArrayList<Box<Fruit>> manyBoxes){
        System.out.println("Выберите действие:\n" +
                "1) Сравнить ящики\n" +
                "2) Пересыпать фрукты(не реализовано)\n" +
                "3) Показать всю информацию о ящиках\n" +
                "4) Добавить к коробкам еще коробку\n" +
                "5) Удалить коробку(зачем-то)");
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        MenuRealisation(point,manyBoxes);
    }

    private static void MenuRealisation(int point, ArrayList<Box<Fruit>> manyBoxes) {
        switch (point){
            case 1:{
                System.out.println("Есть вот такие ящики -> \n");
                Viewer.ShowForCompare(manyBoxes);
                System.out.println("Какие ящики вы хотите сравнить(цифра)?\n 1й ящик:");
                Scanner sc = new Scanner(System.in);
                int firstBox = sc.nextInt();
                System.out.println("2й ящик:");
                int secondBox = sc.nextInt();
                CompareBoxes(manyBoxes.get(firstBox),manyBoxes.get(secondBox));
                SetMenu(manyBoxes);
                break;
            }
            case 2:{
                System.out.println("Я же сказал, что еще не работает!");
                SetMenu(manyBoxes);
                break;
            }
            case 3:{
                Viewer.ShowAllBoxes(manyBoxes);
                SetMenu(manyBoxes);
                break;
            }
            case 4:{
                CreateBoxes.AddList(manyBoxes);
                System.out.println("Теперь там:");
                Viewer.ShowForCompare(manyBoxes);
                SetMenu(manyBoxes);
                break;
            }
            case 5:{
                Viewer.ShowForCompare(manyBoxes);
                System.out.println("Какую удаляем?");
                manyBoxes.remove(new Scanner(System.in).nextInt());
                System.out.println("Теперь там:");
                Viewer.ShowForCompare(manyBoxes);
                SetMenu(manyBoxes);
                break;
            }
            default:break;
        }
    }
    public static void CompareBoxes(Box<Fruit> o1, Box<Fruit> o2) {
        if (o1.compareTo(o2) == 1) {
            System.out.println(o1.getNameBox()+" > "+o2.getNameBox());
        } else if (o1.compareTo(o2) == 0) {
            System.out.println(o1.getNameBox()+" = "+o2.getNameBox());
        } else if (o1.compareTo(o2) == -1) {
            System.out.println(o1.getNameBox()+" < "+o2.getNameBox());
        }
    }
}
