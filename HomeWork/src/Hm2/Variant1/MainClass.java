package Hm2.Variant1;

public class MainClass {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(200);
//        plate.info();
//        cat.eat();
//        plate.setFood(plate.getFood() - cat.getAppetite());
//        plate.info();

        Cat cat1 = new Cat("Barsik", 20, 5);
        Cat cat2 = new Cat("Pushok", 5, 1);
        Cat cat3 = new Cat("Жиробасина", 50, 25);
        Cat cat4 = new Cat("Кирпич", 30, 10);
        Cat cat5 = new Cat("Иван", 40, 10);
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5};

        EtyTime(cats, plate);


        for (Cat kit :
                cats) {
            System.out.println(kit);
            if (kit.getSitost()) System.out.println("Сытый");
            else System.out.println("Не сытый");
        }
    }

    private static void EtyTime(Cat[] cats, Plate plate) {
        while (checkOnSitost(cats)) {
            System.out.println("-----------");
            for (Cat kity : cats) {
                int oldfood = plate.getFood();
                if (!kity.getSitost()) {
                    plate.setFood(kity.eat(plate.getFood()));
                    System.out.println(kity.getName()+" поел на "+ (oldfood - plate.getFood()));
                } else if ((plate.getFood()<=0)) return;
                System.out.println(kity);
            }
            plate.info();

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
