package GUI;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame("Моя программа");
        //Получили размер экрана
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        //frame.setBounds(0, 0, size.width, size.height);
        frame.setSize(size);
        frame.setResizable(false); //разрешение изменения размера
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Завершение по закрытии окна
        frame.setVisible(true); //отображение видимости
        /*1,2 положение, 3,4 ширина высота
        расположение начинается с левого верхнего угла
         */
    }
}
