package Objects.Exercise2;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise2 {

    public static void main(String[] args) {
	// write your code here
    String s = JOptionPane.showInputDialog(null, "Введите радиус окружности");
    try {
        if ((s == null) || (s.equals(""))) throw new Exception();
        double r = Double.parseDouble(s);
        if (r <= 0) throw new NumberFormatException();
        JOptionPane.showMessageDialog(null,"Площадь окружности: " + Math.pow(r, 2) * Math.PI);
    } catch (NumberFormatException e) {
        System.out.println("Необходимо ввести положительное число");
    } catch (Exception e) {
        System.out.println("Введены некорректные данные");
    }
    double summ = 9895;
    double percent = 5.7;
    double result = summ * percent / 100;
        BigDecimal b = new BigDecimal(result);
        System.out.println(b.setScale(2, RoundingMode.HALF_UP));
    }
}
