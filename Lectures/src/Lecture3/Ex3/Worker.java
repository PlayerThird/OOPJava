package Lecture3.Ex3;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.index =0;
    }
    public String fullName(){
        return String.format("%s %s", firstName,lastName);
    }

    int index;//счетчик который сы будем счёлкать

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    /**
     * Возвращает значение по указанному индексу
     * @return имя, фамилия, возраст, зарплата
     */
    @Override
    public String next() {
        switch (index){
            case 1:
                return String.format("Имя: %s",firstName);
            case 2:
                return String.format("Фамилия: %s",lastName);
            case 3:
                return String.format("Возраст: %d",age);
            default:
                return String.format("Возраст: %d",salary);
        }
    }



}
