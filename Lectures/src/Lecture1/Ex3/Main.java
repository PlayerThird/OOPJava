package Lecture1.Ex3;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D(0,2);

        System.out.println(a.getInfo());
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(0);

        System.out.println(b.toString());


        var dis = Point2D.distance(a,b);
        System.out.println(dis);
    }




}

