package Compare;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 7;
        int b = 8;
        int c = 7;
        System.out.println(a + " < " + b + " = " + (a < b)); //true = 1 false = 0
        System.out.println(a + " > " + b + " = " + (a > b)); //true = 1 false = 0
        System.out.println(a + " <= " + b + " = " + (a <= b)); //true = 1 false = 0
        System.out.println(a + " >= " + c + " = " + (a >= c)); //true = 1 false = 0
        System.out.println(a + " == " + c + " = " + (a == c)); //true = 1 false = 0
        System.out.println(a + " != " + c + " = " + (a != c)); //true = 1 false = 0

        //////////////////////////////////
        int x = 2;
        System.out.println("x: " + x);
        int y = 3;
        System.out.println("y: " + y);
        y+= x;
        System.out.println("y: " + y);
        x = y - x;
        System.out.println("x: " + x);
        y = y-x;
        System.out.println("y: " + y);

    }
}
