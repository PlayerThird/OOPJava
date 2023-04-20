package Hm2.Variant2;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Pushok");
        Cat cat3 = new Cat("Жиробасина");
        Cat cat4 = new Cat("Кирпич");
        Cat cat5 = new Cat("Дон");
        Cat cat6 = new Cat("Танос");
        Cat cat7 = new Cat("Царь Египта");
        Cat cat8 = new Cat("Отбитый");
        Cat[] cats = new Cat[]{cat1, cat2, cat3, cat4, cat5,cat6,cat7,cat8};
        System.out.print("В начале было = ");
        plate.info();
        for (Cat kits : cats) {
            System.out.println(kits);
        }
        System.out.println("Ити тайм!");
        EtyTime(cats, plate);

        for (Cat kit : cats) {
            System.out.println(kit);
            if (kit.getSitost()) System.out.println("Сытый");
            else System.out.println("Не сытый");
        }
    }

    private static void EtyTime(Cat[] cats, Plate plate) {
        for (Cat kity : cats) {
            plate.plusEat();
            int newFood = kity.eat(plate.getFood());
            System.out.println("Котэ съел = "+ (newFood));
            System.out.println("После "+kity.getName()+" осталось "+plate.minusFood(newFood));
        }
        plate.info();
    }
}
