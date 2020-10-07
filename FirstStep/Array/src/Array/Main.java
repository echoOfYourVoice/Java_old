package Array;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 30;
        arr[3] = 10;
        arr[4] = 12;
        String str = JOptionPane.showInputDialog(null, "Введите номер элемента", JOptionPane.QUESTION_MESSAGE);
        int d = Integer.parseInt(str);
        System.out.println("Элемент с индексом " + d + " = " + arr[d - 1]);
        double[] d_array = new double[20];
        for (int i = 0; i < d_array.length; i++) {
            d_array[i] = Math.random();
        }
        for (int i = 0; i < d_array.length; i++) {
            System.out.println("[" + i + "]" + " = " + d_array[i]);
        }
        String[] s_arr = {"Michael", "Igor", "Jack"};
        for (int i = 0; i < s_arr.length; i++) {
            System.out.println(s_arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Максимальное значение в массиве arr: " + max);
        for (int a : arr) System.out.println(a); // for each

        String length = JOptionPane.showInputDialog(null, "Введите размер массива", JOptionPane.QUESTION_MESSAGE);
        int a_length = Integer.parseInt(length);
        double[] d_array1 = new double[a_length];
        for (int i = 0; i < d_array1.length; i++) {
           d_array1[i] = Math.random();
        }
        for (double d1 : d_array1) System.out.println(d1);
    }
}
