package Menu;

import Menu.Buttons.GameButtons;
import Menu.Buttons.InventoryButtons;

import javax.swing.*;

public class InventoryFrame {
    public static JFrame inventoryMenu = new JFrame("Инвентарь");
    public static void inventoryFrame() {
        inventoryMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        inventoryMenu.add(InventoryButtons.backToGame());
        inventoryMenu.add(InventoryButtons.whereWe());
        inventoryMenu.add(InventoryButtons.stuf());
        inventoryMenu.add(InventoryButtons.activeStuf());
        inventoryMenu.add(InventoryButtons.backToGame());
        inventoryMenu.setLayout(null);
        inventoryMenu.setVisible(true);
        inventoryMenu.setSize(395, 395);
    }
}
