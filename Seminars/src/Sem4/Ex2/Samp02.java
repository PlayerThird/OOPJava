package Sem4.Ex2;

public class Samp02 {
    public static void main(String[] args) {
    DebitAccount<Entity> entityDebitAccount1 =
            new DebitAccount<>(new Entity("Vaza","113"),40_000_000);
    //передаём тип Entity
        CreditAccount<Person> personCreditAccount =
                new CreditAccount<>(new Person("Ivan","Sergeevich","543"),20);
        //передаём тип Person
        Transaction<Acount<?>> transaction1 = new Transaction<>(entityDebitAccount1,personCreditAccount,20000);
                // Не знаем заранее чей счёт будет
        transaction1.execute();
        Transaction<Acount<?>> transaction2 = new Transaction<>(entityDebitAccount1,personCreditAccount,30000);
        // Не знаем заранее чей счёт будет
        transaction2.execute();
    }
}


class Transaction<T extends Acount<? extends PersonalData>>{//это любой тип счёта, который использует интерфейс PersonalData
    //подстановочный знак = ? -- ссылка на неизвестный тип
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;


    }
    public void execute(){
        if (from.getAmount()> amount){
            System.out.printf("Осуществлен перевод средств между счетами на сумму %.2f ruublic\n",amount);
            System.out.printf("Счёт списания: #%s: %.2f rub. \n Счёт зачисления: #%s: %.2f rub\n",
                    from.getData(),from.getAmount(),to.getData(),to.getAmount());
            from.setAmount(from.getAmount()-amount);
            to.setAmount(to.getAmount()+amount);
            System.out.println("Успешно");
            System.out.println(from);
            System.out.println(to);
        }else {
            System.out.println("Операция невозможна, денег нет :/");
        }
    }
}




class DebitAccount<T extends PersonalData> extends Acount<T>{//т.к. у Acount есть ограничение на обьекты
    public DebitAccount(T data, double amount) {
        super(data, amount);
    }
}







//class CreditAccount extends Acount<Person>{//мы зашили работу только с физ лицом
class CreditAccount<T extends PersonalData> extends Acount<T>{//т.к. у Acount есть ограничение на обьекты
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}



abstract class Acount<T extends PersonalData>{//любой тип, который использует интерфейс PersonalData
    private final T data;
    private double amount;

    public Acount(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s; %.2f rublic",data,amount);
    }
}








interface PersonalData{
    String getINN();
}

/**
 * Физическое лицо
 */
class Person implements PersonalData{
    private final String firstName;
    private final String lastName;

    private final String inn;

    public Person(String firstName, String lastName, String inn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.inn = inn;
    }

    @Override
    public String getINN() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s",inn,lastName,lastName);
    }
}
class Entity implements PersonalData{
    private final String name;
    private final String inn;

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }


    public String getINN() {
        return inn;
    }
    @Override
    public String toString() {
        return String.format("%s: %s",inn,name);
    }
}