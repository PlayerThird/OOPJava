package Hm2.Variant2;

import java.util.Random;

public class Plate {
    private int food;

    public Plate() {
        Random ran = new Random();
        this.food = ran.nextInt(40,100);
    }

    public void info() {
        System.out.println("В миске: " + food + " еды");
    }

    public void setFood(int food) {
        this.food = food;
    }
    public int minusFood(int food){
        this.food -= food;
        return this.food;
    }
public void plusEat(){
        Random r= new Random();
        int dobavka = r.nextInt(1,20);

        if (r.nextInt(2)==1){
            this.food +=dobavka;
            System.out.println("ДОБАВКА!!! ***"+dobavka+"***");
            System.out.println("Теперь в миске = "+ this.food);
        }

}
    public int getFood() {
        return food;
    }
}
