package Hm32.Hm3;

abstract class Employee implements Comparable<Employee>{


    protected String name;
    protected String surName;
    protected double salary;
    static int numberSort;

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s ; Среднемесячная оплата %.2f", name, surName, salary);
    }

    public abstract double calculateSallary();

    public static void setNumber(int num){
        numberSort = num;
    }

    /**
     * Выбор сортировки
     * @param o Какой объект мы сравниваем
     * @return сортировку по пункту меню
     */
    @Override
    public int compareTo(Employee o) {
        switch (numberSort){
            //по зарплате
            case 1 ->{return Double.compare(calculateSallary(),o.calculateSallary());}
        //по имени
            case 2 -> {return name.compareTo(o.name);}
            //по фамилии
            case 3 -> {return surName.compareTo(o.surName);}
        }
return 0;
    }
}
