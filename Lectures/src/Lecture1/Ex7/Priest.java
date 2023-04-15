package Lecture1.Ex7;

import java.util.Random;

/**
 * Герой: Прист
 */
public class Priest extends BaseHero {

    private static int number;
    private static Random r;



    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }


    /**
     * Конструктор героя. Даёт рандомные хп, ману и его индекс
     */
    public Priest(){
        super(String.format("Hero_Priest #%d", ++Priest.number),
                Priest.r.nextInt(100, 200));//супер, т.к. присваиваем на основе BaseHero + элексир от Приста
                this.maxElixir=Priest.r.nextInt(50, 150);
                this.elixir= maxElixir;
    }

    /**
     * Описание героя
     * @return
     */
    public String getInfo(){
        return String.format("%s Elexir: %d",
                super.getInfo(),this.elixir);//к основному выводу + мана
    }

}
