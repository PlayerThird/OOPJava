package Lecture1.Ex7;

import java.util.Random;

public class BaseHero {

    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    /**
     * Конструктор героя
     * @param name Имя героя
     * @param hp Хп героя
     */
    public BaseHero(String name, int hp){
        this.name = name;
        this.hp=hp;
    }
    /**
     * Конструктор героя. Даёт рандомные хп, ману и его индекс
     */
    public BaseHero(){
        this(String.format("Hero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }
    public String getInfo(){
        return String.format("Name: %s Hp: %d  Type: %s",
                this.name,this.hp, this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return this.getInfo();
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
    public void Attack(BaseHero target){
        int damage = BaseHero.r.nextInt(20,30);
        target.GetDamage(damage);

    }
}
