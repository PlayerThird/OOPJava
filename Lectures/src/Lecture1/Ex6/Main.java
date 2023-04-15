package Lecture1.Ex6;

import Lecture1.Ex6.Magician;
import Lecture1.Ex6.Priest;

public class Main {
    public static void main(String[] args) {
        Magician hero1 = new Magician();
        System.out.println(hero1);

        Priest hero2 = new Priest();
        System.out.println(hero2);

        Priest hero3 = new Priest();
        System.out.println(hero3);

//        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
//        System.out.println(hero2);
        System.out.println(hero3);
    }
}
