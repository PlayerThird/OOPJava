package Lecture1.Ex5;

import java.util.Random;

/**
 * Герой: Прист
 */
public class Priest {
    private static final String HERO_PRIEST_D = "Hero_Priest #%d";
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int elixir;
    private int maxElixir;

    static {
        Priest.number = 0;
        Priest.r = new Random();
    }
    public Priest(String name, int hp, int mana){
        this.name = name;
        this.hp=hp;
        this.elixir = mana;
        this.maxElixir = mana;
    }

    /**
     * Конструктор героя. Даёт рандомные хп, ману и его индекс
     */
    public Priest(){
        this(String.format("Hero_Priest #%d", ++Priest.number),
                Priest.r.nextInt(100, 200),
                Priest.r.nextInt(50, 150));
    }

    /**
     * Описание героя
     * @return
     */
    public String getInfo(){
        return String.format("Name: %s Hp: %d Elixir: %d Type: %s",
                this.name,this.hp, this.elixir, this.getClass().getSimpleName());
    }
    @Override
    public String toString() {
        return this.getInfo();
    }
    /**
     * Механизм атаки
     * @return Сила атаки, 0 , если нет манны
     */
    public int Attack(){
        int damage = Priest.r.nextInt(20,30);
        this.elixir -= (int)(damage * 0.8);
        if (elixir<0) return 0;
        else return damage;
    }

    /**
     * Лечение
     * @param Hp Кол-во хп, которое лечится
     */
    public void healed(int Hp){
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    /**
     * Получение атаки
     * @param damage Сколько нанесено атаки
     */
    public void GetDamage(int damage){
        if (this.hp - damage > 0){
            this.hp -= damage;
        }
    }

}
