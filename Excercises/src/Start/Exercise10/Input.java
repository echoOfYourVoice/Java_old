package Start.Exercise10;

import javax.swing.*;

public class Input {
    private String s;

    public String getInput() {
         this.s = JOptionPane.showInputDialog(null, "Введите число", "Введите число", JOptionPane.QUESTION_MESSAGE);
         return this.s;
    }

    public Boolean getInt(String s) {
        if (s == null || s.equals("") || s.contains(",")) {
            JOptionPane.showMessageDialog(null, "Введены некорректные данные");
            return true;
        }
        return parseInput(Double.parseDouble(s), s);
    }
    private Boolean parseInput(double d, String s) {
        String message = null;
        if (d == 0) message = "Введите число, отличное от нуля";
        else if(d < 0) message = "Введите положительное число";
        else if (d % 1 != 0) message = "Введите целое число";
        else return false;
        JOptionPane.showMessageDialog(null, message);
        return true;
    }
}
