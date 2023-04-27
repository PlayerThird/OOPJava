package Hm4;

import java.util.ArrayList;

public class Viewer {
    public static String ShowBox(Box<Fruit> box) {
        return String.format("↱----------↰\n" +
                "|%-10s|\n" +
                "|%11s\n" +
                "|%8.1fkg|\n" +
                "↳----------↲\n", box.getNameBox(),"|", box.CalculatetThisBox());
    }
    public static void ShowForCompare(ArrayList<Box<Fruit>> manyBoxes) {
        for (int i = 0; i < manyBoxes.size(); i++) {

            System.out.println(i +" - "+ manyBoxes.get(i).getNameBox());
        }
    }
    public static void ShowAllBoxes(ArrayList<Box<Fruit>> manyBoxes) {
        for (Box<Fruit> box :
                manyBoxes) {
            System.out.println(ShowBox(box));
        }
    }
}
