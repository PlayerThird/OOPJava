package Hm4;

import java.util.ArrayList;

class Apple extends Fruit implements FullBoxes {
    private static Integer numberAp = 0;
    private String name;
    private Integer numOfApple;

    public Apple(String name) {
        super(1.0f);
        this.name = name;
        numberAp++;
        this.numOfApple = numberAp;
    }

    @Override
    public String toString() {
        return String.format("Apple №%d", numOfApple);
    }

    /**
     * Вес всех созданных яблок
     *
     * @return Вес всех созданных яблок
     */
    public float CalculatedWeight() {
        return getWeight() * numberAp;
    }

//    @Override
//    public ArrayList<Fruit> GenerateFruit(int col) {
//        ArrayList<Fruit> listOfFruit = new ArrayList<>();
//        for (int i = 0; i < col; i++) {
//            listOfFruit.add(new Apple());
//        }
//        return listOfFruit;
//    }
}