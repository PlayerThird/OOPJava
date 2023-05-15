package Menu;


import Controler.MainPlayer;

import Menu.Buttons.GameButtons;

import javax.swing.*;

public class GameFrame {

    public static JFrame gameMenu = new JFrame("Игровое меню");

    public static void gameFrame() {
        gameMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameMenu.add(choiseIf());
        gameMenu.add(GameButtons.Shop());
        gameMenu.add(GameButtons.Inventory());
        gameMenu.add(GameButtons.GiveEat());
        gameMenu.add(GameButtons.Sleep());
        gameMenu.add(GameButtons.Medicine());
        gameMenu.add(GameButtons.Emergency());
        gameMenu.add(GameButtons.GiveWhater());
        gameMenu.add(GameButtons.Game());
        gameMenu.add(GameButtons.status());


        gameMenu.setLayout(null);
        gameMenu.setVisible(true);
        gameMenu.setSize(406, 429);//390/390 стандарт
    }

    public static JButton choiseIf() {
        String text = "";
        String iconName = "";
        String nameClass = MainPlayer.player.getAnimal().name;
        switch (nameClass) {
            case "Cat":
                iconName = FileNamesIcons.setCat();
                text = "Myauuuuu";
                break;
            case "Dog":
                iconName = FileNamesIcons.setDog();
                text = "Gav";
                break;
            case "Panda":
                iconName = FileNamesIcons.setPanda();
                text = "*звук панды*";
                break;
            case "Pig":
                iconName = FileNamesIcons.setPig();
                text = "Oink";
                break;
            case "Chicken":
                iconName = FileNamesIcons.setChik();
                text = "KoKareKu";
                break;
            case "Robot":
                iconName = FileNamesIcons.setRobo();
                text = "Beeb-beeb-bop";
                break;
        }
        JButton botton = new JButton(new ImageIcon(iconName));
        botton.setBounds(145, 130, 100, 100);
        String finalText = text;//незнаю зачем, но IDE так сказал
        botton.addActionListener(e -> System.out.println(finalText));
        return botton;
    }
}
