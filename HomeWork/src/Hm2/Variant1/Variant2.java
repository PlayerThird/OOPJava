package Hm2.Variant1;

public class Variant2 {
    public static void main(String[] args) {
        Plate plate = new Plate(200);

        Cat cat1 = new Cat("Barsik", 20, 5);
        Cat cat2 = new Cat("Pushok", 5, 1);
        Cat cat3 = new Cat("Жиробасина", 50, 25);
        Cat cat4 = new Cat("Кирпич", 30, 10);
        Cat cat5 = new Cat("Иван", 40, 5);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        while (checkOnSitost(cats)) {
            for (Cat kity : cats) {
                int oldfood = plate.getFood();
                if (!kity.getSitost()) {
                    plate.minusFood(plate.getFood()-kity.eat(plate.getFood()));
                    System.out.println(kity.getName()+" поел на "+ (oldfood - plate.getFood()));
                }
            }
            plate.info();

        }

        for (Cat kit :
                cats) {
            System.out.println(kit);
            if (kit.getSitost()) System.out.println("Сытый");
            else System.out.println("Не сытый");
        }
    }

    private static boolean checkOnSitost(Cat[] cats) {
        int count =0;
        for (Cat kits : cats) {
            if (kits.getSitost()) {
                count++;
            } else {
                return true;
            }
        }

        if (count == 5)return false;
        else return true;
    }


}
