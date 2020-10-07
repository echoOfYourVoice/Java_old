package GUI.Excercise2;

import javax.swing.*;

public class Exercise2 {
    public static void main(String[] args) {
        // write your code here
        JFrame frame = new JFrame("Упражнение 1 и 2");
        frame.setBounds(100, 200, 800, 600);
        JLabel label = new JLabel("Поле label");
        frame.add(label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
