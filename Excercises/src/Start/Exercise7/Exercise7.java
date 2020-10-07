package Start.Exercise7;

import javax.swing.*;

public class Exercise7 {
    public static void main(String[] args) {
        // write your code here
        String s;
        String message;
        s = JOptionPane.showInputDialog(null, "Введите положительное число",
                "Введите первое число", JOptionPane.QUESTION_MESSAGE);
        if (s == null || s .equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Необходимо заполнить поле ввода");
            return;
        }
        double d1 = Double.parseDouble(s);
        if (d1 <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Необходимо ввести положительное число");
            return;
        }
        s = JOptionPane.showInputDialog(null, "Введите число, отличное от 0",
                "Введите второе число", JOptionPane.QUESTION_MESSAGE);
        if (s == null || s.equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Необходимо заполнить поле ввода");
            return;
        }
        double d2 = Double.parseDouble(s);
        if (d2 == 0) {
            JOptionPane.showMessageDialog(null, "Результат бесконечность");
            return;
        }
        System.out.println("Результат " + d1 / d2);
    }
}
