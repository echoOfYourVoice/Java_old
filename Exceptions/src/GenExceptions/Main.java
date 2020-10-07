package GenExceptions;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
       try {
           int a = Integer.parseInt(in_1);
           int b = Integer.parseInt(in_2);
           if (a <= 0 || b <= 0) throw new Exception();
           JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Некорректные данные");
           System.out.println(e);
       }
       finally { //Выполняется всегда
           System.out.println("Программа завершена.");
       }
    }
}
