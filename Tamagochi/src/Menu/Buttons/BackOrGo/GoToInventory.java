package Menu.Buttons.BackOrGo;

import Menu.GameFrame;
import Menu.InventoryFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToInventory implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        InventoryFrame.inventoryFrame();
        GameFrame.gameMenu.setVisible(false);
    }
}
