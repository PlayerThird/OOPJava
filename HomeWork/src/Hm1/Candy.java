package Hm1;

import java.util.Random;

public class Candy extends Product{
    private int count;
    private static int number;
    private static Random r;


    static {
        Candy.number = 0;
        Candy.r = new Random();
    }
    public int getCount() {
        return count;
    }
    public Candy(){
        super(String.format("Candy #%d", ++Candy.number),
                Candy.r.nextDouble(150, 300));
        this.count = r.nextInt(5,30);

    }
    public String getInfo(){
        return String.format("%s Кол-во: %d",
                super.getInfo(),this.count);
    }
}
