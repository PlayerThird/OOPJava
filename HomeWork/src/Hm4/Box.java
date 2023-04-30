package Hm4;

import java.util.ArrayList;

class Box<T extends Fruit> implements Comparable<Box> {
    private ArrayList<T> fruits;
    private Float mass;
    private String nameBox;

    public Box(ArrayList<T> fruits, String nameBox) {
        this.nameBox = nameBox;
        this.fruits = fruits;

    }

    public String getNameBox() {
        return nameBox;
    }

    /**
     * Считаем фрукты в коробке
     *
     * @return масса фруктов
     */
    public float CalculatetThisBox() {
        float mass = 0;
        for (Fruit frut :
                fruits) {
            mass += frut.getWeight();
        }
        this.mass = mass;
        return mass;
    }

    public Float getMass() {
        return CalculatetThisBox();

    }
    @Override
    public String toString() {
        return "\nBox" +
                "fruits=" + fruits;
    }

    @Override
    public int compareTo(Box o) {
        if (this.getMass() > o.getMass()) {
            return 1;
        } else if (this.getMass() < o.getMass()) {
            return -1;
        } else return 0;
    }

    //Я пытался :\
//    public ArrayList<Fruit> backFructs(int col, Box<Fruit> fruitBox) {
//        ArrayList<Fruit> fructs = new ArrayList<>();
//        for (int i = 0; i < col; i++) {
//            fructs.add((T) fruitBox.fruits.get(i));
//        }
//        return frutcs;
//    }

//    public void putFruits(Box<Fruit> fruitBox, int col) {
//        if(col > fruitBox.fruits.size()){
//            this.fruits.add(fruitBox.backFructs((fruitBox.fruits.size()),fruitBox));
//        }
//        this.fruits.add(fruitBox.backFructs(col, fruitBox),fruitBox);
//    }
}