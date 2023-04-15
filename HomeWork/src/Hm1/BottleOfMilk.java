package Hm1;

import java.util.Random;

public class BottleOfMilk extends Product {

    private int volume;
    private int fat;
    private static int number;
    private static Random r;


    static {
        BottleOfMilk.number = 0;
        BottleOfMilk.r = new Random();
    }

    public int getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    public BottleOfMilk() {
        super(String.format("Milk #%d", ++BottleOfMilk.number),
                BottleOfMilk.r.nextDouble(100, 200));
        this.fat = r.nextInt(0, 10);
        this.volume = r.nextInt(0, 10);
    }

    public String getInfo() {
        return String.format("%s Жир: %d Объем: %d",
                super.getInfo(), this.fat, this.volume);
    }
}
