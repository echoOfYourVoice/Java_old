package SwitchCase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 1;
        String s;
        while (true) {
            switch (a) {
                case 1:
                    s = "Один";
                    break;
                case 2:
                    s = "Два";
                    break;
                case 3:
                    s = "Три";
                    break;
                default:
                    s = "Другое число";
            }
            System.out.println(a + " - " + s);
            a++;
            if (a > 4) break;
        }
    }
}