package GUIUserComponent;

import javax.swing.*;

public class GUIUserComponent {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(600, 400, 950, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyComponent exit = new MyComponent("Выход", MyListener.EXIT);
        exit.addActionListener(new MyListener());

        MyComponent print = new MyComponent("Печать", MyListener.PRINT);
        print.addActionListener(new MyListener());

        print.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        exit.setAlignmentX(JComponent.CENTER_ALIGNMENT);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(print);
       // panel.add(Box.createVerticalGlue());
        panel.add(Box.createVerticalStrut(10));
        panel.add(exit);

        frame.add(panel);

        frame.setVisible(true);
    }
}
