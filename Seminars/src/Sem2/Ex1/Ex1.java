package Sem2.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Белый");
        cat1.jump();
        cat1.voice();
        System.out.println("Цвет кота" + cat1.getColor());
//        System.out.println("Имя кота"+ ((Animal)cat1).getName());//переопределил кота в тип Animal
        System.out.println("Имя кота" + cat1.getName());

        Dog dog1 = new Dog("Шарик", 9);
        dog1.jump();
        dog1.voice();

        Animal cat2 = new Cat("Персик", "Рыжий");
        cat2.jump();
        cat2.voice();
//        System.out.println("Цвет кота"+ cat2.getColor());//У Animal нет получения цвета
        System.out.println("Цвет кота " + ((Cat) cat2).getColor());//переопределили Animal в Кота, у которого есть получение цвета
        if (cat2 instanceof Dog) {
            System.out.println("Жир собаки " + ((Dog) cat2).getWeight());
        }
        System.out.println("---------------");
        voiceAllAnimal(new Animal[]{cat1, dog1, cat2});

        CatV2 catV2 = new CatV2("Барсик");
        Runnnable catV2_2 = new CatV2("Пэрсык");
        DogV2 dogV2 = new DogV2("Чертила");
        Bird bird = new Bird("Карыч");

        Object[] animals2 = new Object[]{catV2,catV2_2,dogV2,bird};//мы их можем объеденить с помощбю Object, т.к. они ВСЕ происходят от него

        for (Object animal: animals2){
            if (animal instanceof Flyable){
                ((Flyable)animal).fly(50);//приводим животное к интерфейсу и вызываем метод fly
            }
        }
    }

    /**
     * Даём всем голоса
     *
     * @param animals список животных
     */
    private static void voiceAllAnimal(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();//всех животник переопределяем в Animal и от него вызываем их голос(кот, собак)
            if (animal instanceof Dog) {
                System.out.println("Жир собаки " + ((Dog) animal).getWeight());
            }
        }
    }


}

interface Runnnable {

    String getName();

    void swim(int distance);

    void run(int distance);

}

interface Flyable {//контракты, которые обязаны исполнить новые типы

    void fly(int distance);

}

class CatV2 implements Runnnable {

    private String name;

    public CatV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {//т.к. в интерфейсе есть этот метод, мы его должны использовать
        return name;

    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s  проплыл %d метров", name, distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s  пробежал %d метров", name, distance);
    }
}

class DogV2 implements Runnnable {
    private String name;

    public DogV2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s  проплыл %d метров", name, distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s  пробежал %d метров", name, distance);
    }
}

class Bird implements Flyable, Runnnable {//берём интерфейсы, которые будет исполнять класс Птица
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s  проплыл %d метров", name, distance);
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s  пробежал %d метров", name, distance);
    }

    @Override
    public void fly(int distance) {
        System.out.printf("%s  пролетел %d метров", name, distance);
    }

}


abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }


    public void jump() {
        System.out.println("Животное прыгнуло");
    }

    public abstract void voice();//мы не можем создать абстрактные методы НЕ в абстрактном классе
//если создали метод, мы Обязаны его использовать в наследнике
}

class Dog extends Animal {


    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;


    }


    @Override
    public void jump() {//мы можем перепределить
        System.out.println("Собака прыгает");
    }

    @Override
    public void voice() {//мы должны реализовать все абстрактные методы в наследнике
        System.out.println("Собака лает");
    }

    public Integer getWeight() {
        return this.weight;
    }
}

class Cat extends Animal {

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;


    }

    public String getColor() {
        return color;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяу");
    }
}