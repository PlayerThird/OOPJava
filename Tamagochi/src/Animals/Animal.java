package Animals;

import java.util.HashMap;
import java.util.Map;

public class Animal implements CycleMinus {
    private Map<String, Integer> bufs = new HashMap<>(5);
    public final String name;
    private int eat = 100;
    private int whater = 100;
    private int health = 100;
    private int happy = 100;
    private int energy = 100;
    private final int cyclicMinus = 20;

    public Animal(String name, Map<String, Integer> bufs) {
        this.name = name;
    }

    public int getEat() {
        return eat;
    }

    public void plusEat(int plusEat) {
        if ((getEat() + plusEat) <= 100) this.eat += plusEat;
        else this.eat = 100;
    }

    public int getWhater() {
        return whater;
    }

    public void plusWhater(int plusWhater) {
        if ((getWhater() + plusWhater) <= 100) this.whater += plusWhater;
        else this.whater = 100;
    }

    public int getHealth() {
        return health;
    }

    public void plusHealth(int plusHealth) {
        if ((getHealth() + plusHealth) <= 100) this.health += plusHealth;
        else this.health = 100;
    }

    public int getHappy() {
        return happy;
    }

    public void plusHappy(int plusHappy) {
        if ((getHappy() + plusHappy) <= 100) this.happy += plusHappy;
        else this.happy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void plusEnergy(int plusEnergy) {
        if ((getEnergy() + plusEnergy) <= 100) this.energy += plusEnergy;
        else this.energy = 100;
    }

    @Override
    public void minusEat() {
        this.eat -= cyclicMinus + bufs.get("eat");
    }

    @Override
    public void minusWhater() {
        this.whater -= cyclicMinus + bufs.get("whater");
    }

    @Override
    public void minusEnegry() {
        this.energy -= cyclicMinus + bufs.get("energy");
    }

    @Override
    public void minusHappy() {
        this.happy -= cyclicMinus + bufs.get("happy");
    }

    @Override
    public void minusHealth() {
        this.health -= cyclicMinus + bufs.get("health");
    }

    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public int getBufs(String nameBuf) {
        return bufs.get(nameBuf);
    }

    public void setBufs(String nameBuf, int plusBuf) {
        this.bufs.put(nameBuf, bufs.get(nameBuf) + plusBuf);
    }
}
