package Lecture1.Ex3;

/**
 * Это точка 2Д
 */
public class Point2D {
   private int x, y;




    public Point2D() {//по умолчанию, когда объявляем переменную
        this(0,0);//вызываем конструктор, либо с 1м аргументом, либо с 2мя
    }
    public Point2D(int value) {// используя контсруктор с 2мя переменными
        this(value, value);//вызывается конструктор с 2мя аргументами, который передаёт value
    }


    /**
     * Это конструктор
     * @param valueX координата х
     * @param valueY координата у
     */
    public Point2D(int valueX, int valueY) {

        x = valueX;
        y = valueY;
    }

    public int getX(){//вывод х
        return x;
    }
    public int getY(){
        return y;
    }

    public void setX(int value){//ввод х
        this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }

    /**
     * Вывод координат
     * @return строка
     */
    public String getInfo() {
        return String.format("x:%d y:%d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
