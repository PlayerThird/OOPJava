package Hm2.Variant1;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В миске: " + food + " еды");
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void minusFood(int food){
        this.food -= food;
    }

    public int getFood() {
        return food;
    }
}
