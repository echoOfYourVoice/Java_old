package Start.Exercise8;

import javax.swing.*;

public class Exercise8 {
    public static void main(String[] args) {
        // write your code here
       String s;
       s = JOptionPane.showInputDialog(null, "Введите положительное целое число",
               "Ввод числа", JOptionPane.QUESTION_MESSAGE);
       if (s == null || s.equals("")) {
           JOptionPane.showMessageDialog(null, "Вы не ввели число");
           return;
       }
       double d = Double.parseDouble(s);
       String message;
       if (d == 0) message = "Введен ноль";
       else if (d < 0) message = "Введено отрицательное число";
       else if (d % 1 != 0) message = "Введено не целое число";
       else message = null;

       if (message != null) {
           JOptionPane.showMessageDialog(null, message);
           return;
       }
       int result = 0;

       for (int i = 1; i<=Integer.parseInt(s); i++) result += + i;
       JOptionPane.showMessageDialog(null, "Результат " + result);
    }
}
