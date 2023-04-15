package Hm1;

import java.util.Random;

public class BottleOfWhater extends Product {
    private int volume;
    private static int number;
    private static Random r;


    static {
        BottleOfWhater.number = 0;
        BottleOfWhater.r = new Random();
    }

    public int getVolume() {
        return volume;
    }

    public BottleOfWhater(){
        super(String.format("Whater #%d", ++BottleOfWhater.number),
                BottleOfWhater.r.nextDouble(50, 200));
        this.volume = r.nextInt(0,10);

    }

    public String getInfo(){
        return String.format("%s Объем: %d",
                super.getInfo(), this.volume);
    }
//    public Product getBottleOfWater(String)
}
