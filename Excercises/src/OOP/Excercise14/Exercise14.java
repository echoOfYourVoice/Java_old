package OOP.Excercise14;

import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        // write your code here
        int i = 1539;
        int result = rec(i);
        System.out.println(result);


    }

    public static int rec(int n) {
        if (n == 0) return 0;
        int result = 0;
        result += n % 10;
        result += rec(n / 10);
        return result;
    }
}
