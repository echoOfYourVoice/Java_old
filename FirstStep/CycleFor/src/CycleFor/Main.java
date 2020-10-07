package CycleFor;

public class Main {

    public static void main(String[] args) {
	// write your code here
    for (int i = 0; i < 100; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
    for (int i = 0; i < 100; i++)
        if (i % 2 == 0) System.out.print(i + " ");

        int summa = 0;
        int n = 10;
        for (int i = 0; i <= n; i+=2) summa += i; // 2 + 4 + 6 + 8 + 10
        System.out.println();
        System.out.println("Сумма четных чисел от 0 до " + n + " = " + summa);
    }
}
