package Moduls;

import Animals.Animal;
import Stufs.Inventory;

public class Player<T extends Animal> {
    Inventory inventory;
    T animal;

    public Player(T animal) {
        this.inventory = new Inventory();
        this.animal = animal;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void updateInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
