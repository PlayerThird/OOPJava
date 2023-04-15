package Hm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Experemental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите, сколько всего товаров в автомате?");
        int countProduct = sc.nextInt();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < countProduct; i++) {
            int r = rand.nextInt(3);
            if (r == 0) {
                products.add(new BottleOfWhater());
            } else if (r == 1) {
                products.add(new Candy());
            } else {
                products.add(new BottleOfMilk());
            }
        }
        for(var item: products){
            System.out.println(item);
        }
        WendingMachine machine = new WendingMachine(products);
        StartSearch(machine);

    }

    private static void StartSearch(WendingMachine machine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что вы ищите?");
        System.out.println("1) Конфетки\n" +
                "2) Бутылка с водой\n" +
                "3) Бутылка с молоком");
        int searchType = sc.nextInt();

        Choise(searchType, machine);
    }

    private static void Choise(int searchType, WendingMachine machine) {
        Scanner sc = new Scanner(System.in);
        int count;
        switch (searchType) {
            case 1 -> {
                System.out.println("Введите количество конфеток");
                count = sc.nextInt();
                Candy candyRes = machine.getCandy(count);
                if (machine != null && machine.getCandy(count) != null) {
                    System.out.println("Вы купили");
                    System.out.println(candyRes.getInfo());
                } else {
                    System.out.println("Таких конфет нет в автомате");
                    StartSearch(machine);
                }
            }
            case 2 -> {
                System.out.println("Введите сколько литров воды вы хотите, попробуй еще раз");
                count = sc.nextInt();
                BottleOfWhater waterRes = machine.getBottleOfWhater(count);
                if (machine != null && machine.getCandy(count) != null) {
                    System.out.println("Вы купили");
                    System.out.println(waterRes.getInfo());
                } else {
                    System.out.println("Такой бутылки с водой нет в автомате, попробуй еще раз");
                    StartSearch(machine);
                }
            }
            case 3 -> {
                System.out.println("Введите насколько ЖЫРное молоко вы хотите купить");
                count = sc.nextInt();
                System.out.println("...и сколько вам литров этого добра?");
                int value = sc.nextInt();
                BottleOfMilk milkRes = machine.getBottleOfMilk(value, count);
                if (machine != null && machine.getBottleOfMilk(value, count) != null) {
                    System.out.println("Вы купили");
                    System.out.println(milkRes.getInfo());
                } else {
                    System.out.println("Такой бутылки с молоком нет в автомате, попробуй еще раз");
                    StartSearch(machine);
                }
            }
            default -> {
                System.out.println("Такого нет или была введена не цифра");
                StartSearch(machine);
            }
        }

    }
}
