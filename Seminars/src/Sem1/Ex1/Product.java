package Sem1.Ex1;

public class Product {
    protected String name;
    protected String brand;
//    private String brand;// private делает так, чтобы мы не могли работать(изменять) эти поля извне
    protected double price;// protected делает так, чтобы нельзя было использвовать извне + даёт под контроль наследующим объектам
    int param1;
    String param2;
    boolean param3;
    public double getPrice(){// доступ к члену класса
        return price;
    }
    public void setPrice(double price){
        if (price<=0){//более правильный путь в защите
            throw new RuntimeException("Цена указана некоректно");
        }
//        if (price<= 0){
//            this.price = 1;
//        } else {
//            this.price = price;
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3){
            this.name = "Продукт";
        } else {
            this.name = name;
        }
    }

    //    public Product() {//конструктор по умолчанию
//        this("Продукт");//перегрузка конструктора
//        name = "Товар";
//        brand = "OOO";
//        price = 100;
//    }

    {//инициализатор, да, просто пустые скобки
        System.out.println("Inicialization");
        param1 = 100;
        param2 = "Stroka";
        param3 = true;
    }//при объявлении объекта первым вызвается, и заполняется

    public Product() {
        this("Продукт");
    }
    public Product(String name) {
        this(name, 1);// один конструктор вызывает другой, передаём имя и цену по умолчанию
    }

    public Product(String name, double price) {//добавим разные конструкторы
        this("NoName", name, price);
    }

    public Product(String brand, String name, double price) {//конструктор с 3мя параметрами
        System.out.println("Constructor");//декор
        if (name.length() < 3){
            this.name = "Продукт";
        } else {
            this.name = name;
        }
        if (brand.length() < 3){
            this.brand = "Продукт";
        } else {
            this.brand = brand;
        }
        if (price<= 0){
            this.price = 1;
        } else {
            this.price = price;
        }

    }

    /**
     * Получить информацию по продукту
     *
     * @return Информация по продукту
     */
    String displayInfo() {
        return String.format("%s %s %f", brand, name, price);
    }
}
