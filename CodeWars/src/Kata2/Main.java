package Kata2;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
    System.out.println(zeros(0));
    System.out.println(zeros(6));
    System.out.println(zeros(14));
    System.out.println(zeros(1000));
    }

    public static int zeros(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
        while (n > 0) {
            n /= 5;
            result += n;
        }
        }
        return result;
    }
    /*
    public class Solution {
  public static int zeros(int n) {
    int res = 0;
    for (int i = 5; i <= n; i *= 5) {
      res += n / i;
    }
    return res;
  }
}
     */

}
