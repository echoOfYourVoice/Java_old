package Exceptions.Exercise3;

import javax.swing.*;

public class Exercise3 {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = -1;
        arr[3] = 6;
        arr[4] = 1;
        String in = JOptionPane.showInputDialog(null, "Введите индекс элемента массива", JOptionPane.QUESTION_MESSAGE);
        try {
            int a = Integer.parseInt(in);
            if (a < 0) throw new Exception();
            JOptionPane.showMessageDialog(null, arr[a]);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Введены некорректные данные.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Индекс за пределами диапазона массива.");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Введен отрицательный индекс.");
        }
    }
}
