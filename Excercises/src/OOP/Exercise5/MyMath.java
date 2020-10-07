package OOP.Exercise5;

public class MyMath {

private static int count = 0;

    public static int add(int d1, int d2) {
        count++;
        return d1 + d2;
    }
    public static int sub(int d1, int d2) {
        count++;
        return d1 - d2;
    }
    public static int mult(int d1, int d2) {
        count++;
        return d1 * d2;
    }
    public static int div(int d1, int d2) {
        count++;
        return d1 / d2;
    }
    public static int getCount() {
        return count;
    }
}
