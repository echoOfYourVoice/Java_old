package Arithmetic;

public class Main {

    public static void main(String[] args) {
	int a = 10;
	int b = 20;
	int result = a + b;
	System.out.println("Сумма: " + result);
	result = a - b;
	System.out.println("Разность: " + result);
	result = a * b;
	System.out.println("Произведение: " + result);
	result = a / b;
	System.out.println("Деление: " + result);
	double d = a / b;
	System.out.println("Деление с double, но деление целого типа: " + d);
	d = (double) a/ b;
	System.out.println("Деление с преобразованием к типу double: " + d);
	result = 7 % 3; // 2 * 3 + 1
	System.out.println("Остаток от деления: " + result);
	a++; // Инкремент
	b--; // Декремент
		System.out.println("Инкремент: " + a);
		System.out.println("Декремент: " + b);
		a = a + b;
		System.out.println("a: " + a);
		a += b;
		System.out.println("a: " + a);

    }
}
