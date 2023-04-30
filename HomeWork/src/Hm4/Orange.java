package Hm4;

import java.util.ArrayList;

class Orange extends Fruit implements FullBoxes {
    private static Integer numberOr = 0;
    private String name;
    private Integer numOfOrange;

    public Orange(String name) {
        super(1.5f);
        this.name = name;
        numberOr++;
        this.numOfOrange = numberOr;
    }

    @Override
    public String toString() {
        return String.format("Orange №%d", numOfOrange);
    }

    /**
     * Вес всех созданных апельсин
     *
     * @return Вес всех созданных апельсин
     */
    public float CalculatedWeight() {
        return getWeight() * numberOr;
    }

//    @Override
//    public ArrayList<Orange> GenerateFruit(int col) {
//        ArrayList<Orange> listOfFruit = new ArrayList<>();
//        for (int i = 0; i < col; i++) {
//            listOfFruit.add(new Orange(name));
//        }
//        return listOfFruit;
//    }
}