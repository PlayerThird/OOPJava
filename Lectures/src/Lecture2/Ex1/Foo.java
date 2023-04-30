package Lecture2.Ex1;

public class Foo {
    public Integer value;
    private static Integer count; /*= 0*/;// сразу можно задать стандартное значение при вызове, до первого обращения
//статик это не экземпляр класса Foo
    //т.к. статик, мы обращаемся к нему по имени, если он объявлен здесь, значит он и будет работать через Имя типа
    public static Integer getCount(){
        return count;//статические методы можно передавать без this.
    }

    static {//статический конструктор
    count=0;
    }
    public Foo(){
        count++;
    }

    public void printCount(){
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}