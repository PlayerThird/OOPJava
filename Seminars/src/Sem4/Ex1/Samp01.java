package Sem4.Ex1;

import java.util.Arrays;

public class Samp01 {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(5,1000.7);
        System.out.println(simpleAccount);

        UniversalAccount universalAccount1 = new UniversalAccount("3453453",1234.7);
        System.out.println(universalAccount1);
        UniversalAccount universalAccount2= new UniversalAccount(67,1934.7);
        System.out.println(universalAccount2);
        UniversalAccount universalAccount3 = new UniversalAccount("53453",124.7);
        System.out.println(universalAccount3);
        UniversalAccount universalAccount4 = new UniversalAccount(new CustomAccountIdentifier(45,"Ololo"),7);
        System.out.println(universalAccount4);

//        CustomAccountIdentifier identifier = (CustomAccountIdentifier)universalAccount2.getId();// ошибка ClassCastException
        Account<Integer> account1 = new Account<>(435,666.7);
//             тип id
        System.out.println(account1);
        int account1Id = account1.getId();

        Account<CustomAccountIdentifier> account2 = new Account<>(new CustomAccountIdentifier(45,"Ololo"),666.7);
//              передали в id объект класса CustomAccountIdentifier
        System.out.println(account2);
        CustomAccountIdentifier account2Id = account2.getId();

        Integer[] numbers = {3,7,23,2,7,6,8,5,0};
        Object[] numTwo =ArrayUtils.replaceTwoElement(numbers,0,2);
        //т.к. возвращает тип Object
        String[] strs = {"AAA","FFF","WWW","BBB"};
        Object[] striiiing =(String[])ArrayUtils.replaceTwoElement(strs,0,2);
//                          преобразуем Object[] к String[]
        System.out.println(Arrays.toString(numTwo));
        System.out.println(Arrays.toString(striiiing));

        String[] aa =ArrayUtils.<String>replaceTwoElemV2(strs,2,6);
//необязательно перед методом описывать тип, т.к. мы присваиваем уже к String[]

    }
}

class ArrayUtils{
    /**
     * Поменять местами оъекты в списке
     * @param array список, в котором нужно поменять
     * @param index1 1 индекс объекта
     * @param index2 2 индекс объекта
     */
    public static Object[] replaceTwoElement(Object[] array, int index1,int index2){
        Object[] newArr = array.clone();
        if (index1 >= array.length || index2>= array.length || index1<0 || index2<0){
            return null;
        }
        Object obj = newArr[index1];
        newArr[index1] = newArr[index2];
        newArr[index2] = obj;
        return newArr;
    }

    /**
     * Обобщённый метод
     * @param array
     * @param index1
     * @param index2
     * @return
     */
    public static <T> T[] replaceTwoElemV2(T[] array, int index1,int index2){
        T[] newArr = array.clone();
        if (index1 >= array.length || index2>= array.length || index1<0 || index2<0){
            return null;
        }
        T obj = newArr[index1];
        newArr[index1] = newArr[index2];
        newArr[index2] = obj;
        return newArr;
    }
}



class Account<T>{
    private final T id;
    private double amount;

    public T getId() {
        return id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public Account(T id, double amount) {//получаем неизвестный тип идентификатора
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сума средств на счёте #%s : %s rubil", id,amount);
    }
}



class CustomAccountIdentifier{
    private int id;
    private String prefix;


    public CustomAccountIdentifier(int id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "CustomAccountIdentifier{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}



class SimpleAccount{
    private final int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public SimpleAccount(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сума средств на счёте #%s : %s rubil", id,amount);
    }
}

class UniversalAccount{
    private final Object id;//принимает любой тип
    private double amount;

    public Object getId() {
        return id;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public UniversalAccount(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сума средств на счёте #%s : %s rubil", id,amount);
    }
}