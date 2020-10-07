package Start.Exercise6;

public class Exercise6 {
    public static void main(String[] args) {
        // write your code here
    int i1 = 5;
    int i2 = 10;
    String s1 = Integer.toBinaryString(i1);
    String s2 = Integer.toBinaryString(i2);
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    System.out.println("s1 & s2: = " + (i1 & i2));
    System.out.println(Integer.toBinaryString(i1 & i2));
    System.out.println("s1 | s2: = " + (i1 | i2));
    System.out.println(Integer.toBinaryString(i1 | i2));
    System.out.println("s1 ^ s2: = " + (i1 ^ i2));
    System.out.println(Integer.toBinaryString(i1 ^ i2));
    System.out.println("i1 >> 1 " + Integer.toBinaryString(i1 >> 1));
    System.out.println("i2 >> 1 " + Integer.toBinaryString(i2 >> 1));
    System.out.println("i1 << 1 " + Integer.toBinaryString(i1 >> 1));
    System.out.println("i2 << 1 " + Integer.toBinaryString(i2 >> 1));
    System.out.println("~i1 " + Integer.toBinaryString(~i1));
    System.out.println("!i2 " + Integer.toBinaryString(~i2));
    }
}
