package CycleDoWhile;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 5;
        while (a > 10) {
            System.out.println("Мы в цикле while");
        }
        do {
            System.out.println("Мы в цикле do-while!");
        } while (a > 10); // выполнится хотя бы 1 раз
        a = 0;
        while (true) {
          a++;
          if (a==10) break;
          if (a % 2 == 0) continue;
          System.out.println(a);
        }
    }
}
