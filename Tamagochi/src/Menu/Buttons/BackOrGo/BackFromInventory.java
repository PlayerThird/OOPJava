package Menu.Buttons.BackOrGo;

import Menu.GameFrame;
import Menu.InventoryFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackFromInventory implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GameFrame.gameFrame();
        InventoryFrame.inventoryMenu.setVisible(false);
    }
}
