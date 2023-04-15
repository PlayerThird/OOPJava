package Hm1;

import java.util.List;

public class WendingMachine {

    private final List<Product> products;//final -- эта переменная не подлежит модификации в этой области
    //можно буедет только из конструктора что-то менять в листе


    public WendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWhater getBottleOfWhater(int volume){
        for (Product product : products){//возвращаем только воду
            if (product instanceof BottleOfWhater){//если в нашем списке есть бутылка с водой
                if (((BottleOfWhater)product).getVolume() == volume){
                    return (BottleOfWhater)product;//т.к. мы 100% убедились, что нашли и проверили, что это бутылка с водой
                    //мы её возвращаем
                }
            }
        }
        return null;
    }
    public BottleOfMilk getBottleOfMilk(int volume, int fat){
        for (Product product : products){//возвращаем только воду
            if (product instanceof BottleOfMilk){//если в нашем списке есть бутылка с молоком
                if (((BottleOfMilk)product).getVolume() == volume && ((BottleOfMilk)product).getFat() == fat){
                    return (BottleOfMilk) product;//т.к. мы 100% убедились, что нашли и проверили, что это бутылка с молоком
                    //мы её возвращаем
                }
            }
        }
        return null;
    }
    public Candy getCandy(int count){
        for (Product product : products){
            if (product instanceof Candy){
                if (((Candy)product).getCount() == count){
                    return (Candy) product;
                }
            }
        }
        return null;
    }





    // TODO: Разработать метод получения бутылки с молоком самостоятельно

}
