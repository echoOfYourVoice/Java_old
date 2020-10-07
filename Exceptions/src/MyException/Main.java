package MyException;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String in_1 = JOptionPane.showInputDialog(null, "Введите положительное число 1");
        String in_2 = JOptionPane.showInputDialog(null, "Введите положительное число 2");
       try {
           int a = Integer.parseInt(in_1);
           int b = Integer.parseInt(in_2);
           if (a <= 0 || b <= 0) throw new NegativeException();
           //if (a > 100) throw new BigException() можно создать свой класс исключения на все случаи жизни
           JOptionPane.showMessageDialog(null, "Сумма чисел: " + (a + b));
       } catch (NumberFormatException e) { //От малых исключений к глобальным
           JOptionPane.showMessageDialog(null, "Вы не ввели числа!");
           System.out.println(e);
       }
       catch (NegativeException e) {
           JOptionPane.showMessageDialog(null, "Числа отрицательные!");
           System.out.println(e);
       }
       finally { //Выполняется всегда
           System.out.println("Программа завершена.");
       }
         */
        String in = JOptionPane.showInputDialog(null, "Введите логин");
        User user = new User();
        try {
            user.setLogin(in);
            System.out.println(user.getLogin());
        } catch (UserException e) {
            if (e.getCode() == UserException.SHORT_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком короткий");
            }
            else if (e.getCode() == UserException.LONG_LOGIN) {
                JOptionPane.showMessageDialog(null, "Логин слишком длинный");
            }
        }
    }
}
