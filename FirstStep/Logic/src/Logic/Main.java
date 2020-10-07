package Logic;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean b_1 = true; // 1
        boolean b_2 = false; // 0
        //Логическое и (true только тогда, когда все одинаковые)
        System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2)); // 1 * 0
        // Логическое или (true, когда хотя бы один true)
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); // 1 + 0
        // Различие (true, когда операнды различны)
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2));
        // Отрицание
        System.out.println("!" + b_2 + " = " + !b_2);
    }
}
