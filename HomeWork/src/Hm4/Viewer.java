package Hm4;

public class Viewer {
    public static String ShowBox(Box<Fruit> box) {
        return String.format("------------\u0177\n" +
                "|          |\n" +
                "|%s|\n" +
                "|%10.8f|\n" +
                "------------\n", box.getNameBox(), box.CalculatetThisBox());
    }
}
