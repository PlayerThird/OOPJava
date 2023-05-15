package Menu.Buttons.ChoiseAnimal;

import Animals.*;

public class ChoiseAnimal {
    public static Animal ChoiseCat(){
        return new Cat();
    }
    public static Animal ChoiseDog(){
        return new Dog();
    }
    public static Animal ChoiseChicken(){
        return new Chicken();
    }
    public static Animal ChoisePanda(){
        return new Panda();
    }
    public static Animal ChoisePig(){
        return new Pig();
    }
    public static Animal ChoiseRobot(){
        return new Robot();
    }
}
