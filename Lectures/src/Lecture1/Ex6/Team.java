package Lecture1.Ex6;

import Lecture1.Ex5.Magician;

import java.util.Random;

public class Team {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicCount;

        System.out.printf("MagicCount: %d PriestCount: %d\n", magicCount,priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicCount];
        /**
         * Заполняем комманды рандомными челиками
         */
        for (int i = 0; i < priestCount;i++){
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();
        for (int i = 0; i < magicCount;i++){
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }
        System.out.println();


    }
}
