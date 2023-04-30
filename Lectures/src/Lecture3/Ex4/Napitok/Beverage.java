package Lecture3.Ex4.Napitok;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    public List<Ingredient> components;
    int index;

    public Beverage() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public void addComponent(Ingredient component){
        components.add(component);
    }//можно описать, а если есть уже этот ингридиент?


}
