package Hm1;

public class Product {
    private static int number;
    protected String name;
    protected String brand;
    protected double price;
    public double getPrice(){// доступ к члену класса
        return price;
    }
    public void setPrice(double price){
        if (price<=0){//более правильный путь в защите
            throw new RuntimeException("Цена указана некоректно");
        }
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

    public Product() {
        this("Продукт");
    }
    public Product(String name) {
        this(name, 1);// один конструктор вызывает другой, передаём имя и цену по умолчанию
    }

    public Product(String name, double price) {//добавим разные конструкторы
        this(String.format("Brand #%d", ++Product.number), name, price);
    }

    public Product(String brand, String name, double price) {//конструктор с 3мя параметрами
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
    String getInfo() {
        return String.format("Брэнд: %s Имя: %s Цена: %5.2f", brand, name, price);
    }
    @Override
    public String toString() {
        return this.getInfo();
    }
}
