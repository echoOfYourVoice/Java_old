package Objects.ObjectMath;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println(Math.E);
    System.out.println(Math.PI);
    System.out.println(Math.abs(-5)); // Возврат положительного числа(модуль)
    System.out.println(Math.cos(1)); //косинус в радианах
    System.out.println(Math.sin(1)); //синус в радианах
    System.out.println(Math.tan(1)); //тангенс в радианах
        System.out.println(Math.sin(30 * Math.PI / 180)); //синус в в градусах
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.pow(5, 2)); //Степень
        System.out.println(Math.round(5.4)); //Округление
        System.out.println(Math.ceil(5.1)); //Округление до ближайшего верхнего целого
        System.out.println(Math.floor(5.9)); //Округление до ближайшего нижнего целого
        BigDecimal bd = new BigDecimal(5.87858);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP));
        System.out.println(Math.random());
        int i = (int) (1 + Math.random() * 11);
        System.out.println(i);

    }
}
