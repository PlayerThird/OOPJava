package Lecture1.Ex2;

public class Main {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.x = 0;
        a.y = 2;
        System.out.println(a);
        
        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b);
        System.out.println(distance(a,b));
    }

     static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2));
    }
}
