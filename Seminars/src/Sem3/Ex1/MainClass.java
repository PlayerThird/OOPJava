package Sem3.Ex1;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик", 10);
        Dog dog1 = new Dog("Шарик", 20, 30);
        Animal animal1 = new Animal("Лапы и хвост", 30, 20);
        Animal animal2 = new Animal("Лапы и хвост 2", 5, 15);

        System.out.println("Общее кол-во животных: " + Animal.getCounter());
        System.out.println("Общее кол-во котов: " + Cat.getCounter());
        System.out.println("Общее кол-во догов: " + Dog.getCounter());
    }
}

class Animal {
    protected String name;
    private int maxRun;
    private int maxSwim;
    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {//инициализатор, срабатывает первый раз, потом конструктор
        counter++;
    }// если статик, он срабатывает ОДИН раз при первом создании обьекта класса

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров", name, distance);
        } else {
            System.out.printf("%s не пробежал %d метров", name, distance);
        }
    }

    public void swim(int distance) {
        if (distance <= this.maxSwim) {
            System.out.printf("%s проплыл %d метров", name, distance);
        } else {
            System.out.printf("%s не проплыл %d метров", name, distance);
        }

    }

}

class Dog extends Animal {
    static int counter;

    {
        counter++;
    }
    public static int getCounter() {//Перекрыли метод из Animal, т.е. это счётчик именно Дога
        return counter;
    }//можно высвать Dog.getCounter, если он не был бы тут описан, он бы вызывался из базового класса
    //т.е. счётчик самого Animal

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
}

class Cat extends Animal {
    static int counter;

    {
        counter++;
    }
    public static int getCounter() {
        return counter;
    }

    public Cat(String name, int maxRun) {
        super(name, maxRun, 0);
    }



    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать :(\n", name);
    }
}