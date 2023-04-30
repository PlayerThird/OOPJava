package Hm32.Hm3;

import java.util.Comparator;

public class SallaryComporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateSallary(), o2.calculateSallary());
    }

    class NameComporator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    }
}
