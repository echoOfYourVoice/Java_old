package Exceptions.Exercise2;

import javax.swing.*;

public class Exercise2 {

    public static void main(String[] args) {
	// write your code here
    String in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
    try {
        int a = Integer.parseInt(in);
        JOptionPane.showMessageDialog(null, "Спасибо!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Некорректные данные.");
    }
    }
}
