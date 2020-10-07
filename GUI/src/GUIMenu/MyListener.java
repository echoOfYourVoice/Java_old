package GUIMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {

    JFrame frame;
    public MyListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    System.out.println(actionEvent.getActionCommand());
    String c = actionEvent.getActionCommand();
    if (c.equals("Выход")) {
        System.exit(0);
    }
    else if (c.equals("Желтый")) {
    frame.getContentPane().setBackground(Color.YELLOW);
    }
    else if (c.equals("Синий")) {
        frame.getContentPane().setBackground(Color.BLUE);
    }
    else if (c.equals("Стандартный")) {
        frame.getContentPane().setBackground(Color.CYAN);
    }
    }
}
