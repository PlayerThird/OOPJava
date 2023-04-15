package Lecture1.Ex7;

import Lecture1.Ex7.Magician;
import Lecture1.Ex7.Priest;
import Lecture1.Ex7.BaseHero;

public class Main {
    public static void main(String[] args) {
//        Magician hero1 = new Magician();
//        System.out.println(hero1);
//
//        Priest hero2 = new Priest();
//        System.out.println(hero2);

        BaseHero hero3 = new Magician();
        System.out.println(hero3);

        BaseHero hero4 = new Priest();
        System.out.println(hero4);
        System.out.println("-------------Began battle---------");
        System.out.println(hero3);
        System.out.println(hero4);

        System.out.println("-----------1st round---------");
        hero3.Attack(hero4);
        hero4.Attack(hero3);

        System.out.println(hero3);
        System.out.println(hero4);

        System.out.println("-----------2nd round---------");
        hero3.Attack(hero4);
        hero4.Attack(hero3);

        System.out.println(hero3);
        System.out.println(hero4);



    }
}
