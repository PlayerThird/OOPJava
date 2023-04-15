package Sem1.Ex1;

public class BottleOfWhater extends Product{//чтобы унаследовать из продукта, там нужно прописать конструктор по умолчанию
    private int volume;

    public int getVolume() {
        return volume;
    }

    public BottleOfWhater(String name, double price, int volume){
        super(name, price);//инициализируем конструктор на базе продукта
        this.volume = volume;
    }

    @Override
    String displayInfo() {//переопределяем метод из продукта
//        return super.displayInfo();
        return String.format("%s %s %f объем - %d", brand, name, price, volume);
    }
//    public Product getBottleOfWater(String)
}
