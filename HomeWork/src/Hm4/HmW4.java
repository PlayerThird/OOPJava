package Hm4;

import java.util.ArrayList;


public class HmW4 {
    public static void main(String[] args) {
        ArrayList<Box<Fruit>> manyBoxes = CreateBoxes.CreateFruits();
        Menu.SetMenu(manyBoxes);
    }
}







