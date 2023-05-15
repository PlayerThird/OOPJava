package Menu;

import Menu.Buttons.GameButtons;
import Menu.Buttons.ShopButtons;

import javax.swing.*;

public class ShopFrame {
    public static JFrame shopFrame = new JFrame("Магазин");
    public static void shopFrame() {
        shopFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        shopFrame.add(ShopButtons.backToGame());
        shopFrame.add(ShopButtons.upText());
        shopFrame.add(ShopButtons.leftText());
        shopFrame.add(ShopButtons.howManyInInvent());
        shopFrame.add(ShopButtons.saleInvent());
        shopFrame.setSize(390, 390);
        shopFrame.setLayout(null);
        shopFrame.setVisible(true);

    }
}
