package Lecture1.Ex5;

import java.util.Random;

public class Magician {
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magician.number = 0;
        Magician.r = new Random();
    }

    /**
     * Конструктор мага
     * @param name Имя мага
     * @param hp Хп мага
     * @param mana Мана и макс мана
     */
    public Magician(String name, int hp, int mana){
        this.name = name;
        this.hp=hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    /**
     * Конструктор героя. Даёт рандомные хп, ману и его индекс
     */
    public Magician(){
        this(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt(100, 200),
                Magician.r.nextInt(50, 150));
    }
    public String getInfo(){
        return String.format("Name: %s Hp: %d Mana: %d Type: %s",
                this.name,this.hp, this.mana, this.getClass().getSimpleName());
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
        int damage = Magician.r.nextInt(20,30);
        this.mana -= (int)(damage * 0.8);
        if (mana<0) return 0;
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
