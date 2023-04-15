package Lecture1.Ex7;

import Lecture1.Ex7.Magician;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicCount = 0;
        int priestCount = 0;

        List<BaseHero> teams = new ArrayList<>();

        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new Priest());
                priestCount++;
            } else {
                teams.add(new Magician());
                magicCount++;
            }
            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("MagicCount: %d PristCount: %d \n\n", magicCount, priestCount);


    }
}
