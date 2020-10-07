package Recursion;

public class Recursion {

    public static void main(String[] args) {
	//System.out.println(zeros(14));
       // System.out.println(factorial(5)); // 1 * 2 * 3 * 4 * 5
    }

    public static int zeros(int n) {
        int result = 0;
        if (n < 5) return result;
        String sFactorial = Integer.toString(factorial(n));
        //System.out.println(sFactorial);
        for (int i = 0; i < sFactorial.length(); i++) {
            Character value = new Character(sFactorial.charAt(i));
            if (value.equals(new Character('0'))) result += 1;
          //  System.out.println(result);
        }
        //System.out.println("--------------------");
        return result;
    }

    public static int factorial(int x) {
     if (x==1) return 1;
     System.out.println(factorial(x - 1) * x);
     return factorial(x - 1) * x;
    }
}
