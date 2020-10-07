package Kata7;

public class Main {

    public static void main(String[] args) {
System.out.println(digital_root(16));
System.out.println(digital_root(456));
    }

    public static int digital_root(int n) {
    String s = Integer.toString(n);
    if (s.length() == 1) return  n;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
    int a = Integer.parseInt(s.charAt(i) + "");
    result += a;
    }
    return digital_root(result);
    }

}
/*
public class DRoot {
  public static int digital_root(int n) {
    return (n != 0 && n%9 == 0) ? 9 : n % 9;
  }
}
 */

/*
public class DRoot {
  public static int digital_root(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }
}
 */

