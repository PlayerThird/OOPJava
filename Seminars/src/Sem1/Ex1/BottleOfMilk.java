package Sem1.Ex1;

public class BottleOfMilk extends Product{
    private int volume;
    private int fat;
    public int getVolume() {
        return volume;
    }
    public int getFat() {
        return fat;
    }

    public BottleOfMilk(String name, double price, int volume, int fat) {
    super(name,price);
    this.volume = volume;
    this.fat = fat;
    }
}
