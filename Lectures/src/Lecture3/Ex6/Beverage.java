package Lecture3.Ex6;

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

        if (!(components.indexOf(component) != -1)) {
            components.add(component);//если есть такой компонент, мы его не добавляем
        }
    }


}
