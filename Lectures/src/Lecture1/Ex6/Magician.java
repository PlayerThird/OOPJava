package Lecture1.Ex6;

import java.util.Random;

public class Magician extends BaseHero {


    private int mana;
    private int maxMana;





    /**
     * Конструктор героя. Даёт рандомные хп, ману и его индекс
     */
    public Magician(){
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200));//супер, т.к. присваиваем на основе BaseHero + мана от Мага
         this.maxMana = Magician.r.nextInt(50, 150);
         this.mana = maxMana;
    }
    public String getInfo(){
        return String.format("%s Mana: %d",
                super.getInfo(),this.mana);//к основному выводу + мана
    }


    /**
     * Механизм атаки
     * @return Сила атаки, 0 , если нет манны
     */
    public int Attack(){
        int damage = Magician.r.nextInt(20,30);
        this.mana -= (int)(damage * 0.8);
        if (mana<0) return 0;
        else return damage;
    }
}
