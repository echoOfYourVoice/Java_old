package GUIKey;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyListener implements KeyListener {

    JFrame frame;
    public MyListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    //
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
    //
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    int keyCode = keyEvent.getKeyCode();
    switch (keyCode) {
        case 27:
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(frame, "Это действие еще не обработано");
    }
    }
}
