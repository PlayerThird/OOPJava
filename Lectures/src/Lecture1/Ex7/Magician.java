package Lecture1.Ex7;

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

    public void minusMana(int damage){
        if (this.mana < damage) this.mana = 0;
        else this.mana -= damage;
    }


}
