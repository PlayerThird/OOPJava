package Hm2.Variant2;

import java.util.Random;

public class Cat {

    private String name;
    private int appetite;
    private boolean sitost = false;


    /**
     * Параметры котика
     *
     * @param name Имя кота
     */
    public Cat(String name) {
        Random ran = new Random();
        this.name = name;
        this.appetite = ran.nextInt(1, 30);

    }

    public int eat(int food) {
            if (!(this.appetite >= food)) {
                food =this.appetite;
                this.sitost = true;
                this.appetite = 0;
                return food;
            } else {
                return 0;
            }
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }


    @Override
    public String toString() {
        return String.format("Kote %s голоден на %d пунктов", name, appetite);
    }

    public boolean getSitost() {
        return sitost;
    }
}
