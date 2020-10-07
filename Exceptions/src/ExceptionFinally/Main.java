package ExceptionFinally;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String in_1 = JOptionPane.showInputDialog(null, "Введите число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите число 2");
       try {
           int a = Integer.parseInt(in_1);
           int b = Integer.parseInt(in_2);
           JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Вы не ввели число");
           System.out.println(e);
       }
       finally { //Выполняется всегда
           System.out.println("Программа завершена.");
       }
    }
}
