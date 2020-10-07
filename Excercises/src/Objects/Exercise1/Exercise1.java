package Objects.Exercise1;

import javax.swing.*;

public class Exercise1 {

    public static void main(String[] args) {
	// write your code here
        String s = JOptionPane.showInputDialog(null, "Введите любую строку");
        try {
            if (s == null || (s.equals(""))) throw new Exception();
            s = s.trim();
            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
            if (s.length() < 6) throw new Exception();
            System.out.println(s.substring(1, 5));
            System.out.println(s.contains("hello"));
        } catch (Exception e) {
        System.out.println("Введены некорректные данные");
        }
    }
}
