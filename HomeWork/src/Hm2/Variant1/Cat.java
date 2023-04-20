package Hm2.Variant1;

public class Cat {

    private String name;
    private int appetite;
    private boolean sitost = false;


    private int mouth;

    /**
     * Параметры котика
     * @param name Имя кота
     * @param appetite Сытость кота
     * @param mouth Объем съеденного за раз
     */
    public Cat(String name, int appetite, int mouth) {
        this.name = name;
        this.appetite = appetite;
        this.mouth= mouth;
    }

    public int eat(int food) {
        if (mouth >= food || appetite <= 0){
            changeSitost();
    }else if (appetite<=mouth && appetite>=food){
            food -= appetite;
            appetite =0;
            changeSitost();
        }
        else {
            this.appetite-= mouth;
            food -= mouth;
        }
        return food;
    }


    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSitost(boolean sitost) {
        this.sitost = sitost;
    }
    public void changeSitost(){
        this.sitost =true;
    }
    public int getMouth() {
        return mouth;
    }

    public boolean getSitost() {
        return sitost;
    }

    @Override
    public String toString() {
        return String.format("Kote %s голоден на %d пунктов", name,appetite);
    }
}
