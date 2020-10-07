package Start.Exercise9;

import javax.swing.*;

public class Exercise9 {
    public static void main(String[] args) {
        // write your code here
    String s;
    s = JOptionPane.showInputDialog(null, "Введите положительное целое число", "Введите число", JOptionPane.QUESTION_MESSAGE);
    if (s != null && !s.equals("")) {
    Double d = Double.parseDouble(s);
    if (d % 1 != 0) {
        JOptionPane.showMessageDialog(null, "Введено не целое число");
        return;
    }
    if (d < 0) {
        JOptionPane.showMessageDialog(null, "Введено отрицательное число");
        return;
    }
    int i = Integer.parseInt(s);
    int result = 1;
    while (i > 0)  {
        result *= i;
        i--;
    }
    JOptionPane.showMessageDialog(null, "Результат " + result);
    }
    else JOptionPane.showMessageDialog(null, "Введены некорректные данные");
    }
}
