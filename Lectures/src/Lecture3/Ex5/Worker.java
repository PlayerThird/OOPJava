package Lecture3.Ex5;

public class Worker implements Comparable<Worker>{


    public   int salary;
    private  int age;
    private  String name;
    private String secName;

    public Worker(String name, String secName, int age, int salary) {
    this.name = name;
    this.secName = secName;
    this.age = age;
    this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nsalary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", secName='" + secName;
    }

    @Override
    public int compareTo(Worker o) {
        if (this.age > o.age){
            return 1;
        } else if (this.age < o.age) {
            return -1;
        }else return 0;
    }

}
