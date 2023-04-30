package Lecture3.Ex4;

import Lecture3.Ex4.Napitok.*;

public class Program {
    public static void main(String[] args) {
    Cofee latte = new Cofee();
    latte.addComponent(new Water("Water"));
        latte.addComponent(new Water("Water"));
        latte.addComponent(new Water("Water"));
        for (var ingredient : latte){
            System.out.println(ingredient);
        }

    }
}