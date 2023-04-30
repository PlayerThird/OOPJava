package Lecture3.Ex4.Napitok;

import java.util.Iterator;

public class Cofee extends Beverage {
    @Override
    public Iterator<Ingredient> iterator() {//переопределение под себя итератора
        Iterator<Ingredient> it = new Iterator<Ingredient>() {
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
