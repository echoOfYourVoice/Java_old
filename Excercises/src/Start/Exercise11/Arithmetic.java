package Start.Exercise11;

import javax.swing.*;

public class Arithmetic {
    private String data;
    public Arithmetic() {
        data = JOptionPane.showInputDialog(null, "Введите арифметическое выражение", "Введите арифметическое выражение", JOptionPane.QUESTION_MESSAGE);
    }

    public boolean analizeArithmetic(String s) {
        if (s == null) {
            JOptionPane.showMessageDialog(null, "Введены некорректные данные");
            return false;
        }
        if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
            JOptionPane.showMessageDialog(null, "Введены некорректные данные");
            return false;
        }
        return true;
    }

    public String getData() {
        return data;
    }
}
