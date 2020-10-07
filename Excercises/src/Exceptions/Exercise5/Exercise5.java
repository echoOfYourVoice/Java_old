package Exceptions.Exercise5;


import javax.swing.*;

public class Exercise5 {

    public static void main(String[] args) throws NoNumberException {
        // write your code here
        String in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        try {
            if (in == null) throw new NullException();
            int a = Integer.parseInt(in);
            JOptionPane.showMessageDialog(null, "Спасибо!");
        } catch (NullException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
