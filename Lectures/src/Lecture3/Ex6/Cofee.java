package Lecture3.Ex6;

import java.util.Iterator;

public class Cofee extends Beverage {
    @Override
    public Iterator<Ingredient> iterator() {//переопределение под себя итератора
        Iterator<Ingredient> it = new Iterator<Ingredient>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index++);
            }
        };
        return it;
    }
}
