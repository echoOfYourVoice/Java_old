package BitOperation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 4;
        int b = 7;
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        System.out.println("s_a: " + s_a);
        System.out.println("s_b: " + s_b);
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b)); // Побитовое и
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b)); // Побитовое или
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b)); // Исключающее или
        System.out.println("~" + s_a + " = " + Integer.toBinaryString(~a));
        System.out.println("~" + a + " = " + ~a);
        System.out.println(s_a + " >> 1 = " + Integer.toBinaryString(a>>1)); //Сдвиг вправо (эквивалентно делению на 2)
        System.out.println(a + " >> 1 = " + (a>>1));
        System.out.println(s_a + " << 1 = " + Integer.toBinaryString(a<<1)); //Сдвиг влево (эквивалентно умножению на 2)
        System.out.println(a + " << 1 = " + (a<<1));
    }
}
