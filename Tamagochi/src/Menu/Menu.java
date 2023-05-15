package Menu;

import Menu.Buttons.GameButtons;
import Menu.Buttons.MainButtons;

import javax.swing.*;

public class Menu {
    public static JFrame mainFrame = new JFrame("Экран выбора");
    public static void MainMenu() {
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setName("Main menu");
//        JFrame secondFrame = new JFrame("Второе окно меню");
        mainFrame.add(MainButtons.CatBut());
        mainFrame.add(MainButtons.PigBut());
        mainFrame.add(MainButtons.PandBut());
        mainFrame.add(MainButtons.ChikBut());
        mainFrame.add(MainButtons.RoboBut());
        mainFrame.add(MainButtons.DogBut());
        mainFrame.setSize(406, 429);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
//    public static void clearMenu(){
//        mainFrame.removeAll();
//    }
//    public static void gameMenu(){
//        mainFrame.add(GameButtons.CatBut());
//
//    }
}
