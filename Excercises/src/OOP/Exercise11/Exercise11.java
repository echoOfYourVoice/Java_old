package OOP.Exercise11;

import OOP.Exercise1.User;

public class Exercise11 {

    public static void main(String[] args) {
	// write your code here
        Integer[] mass = {1, 2, 3};
    Shop shop1 = new Shop(mass);
    shop1.printObject();
    System.out.println();
    String[] massS = {"R", "O", "M", "A"};
    Shop shop2 = new Shop(massS);
    shop2.printObject();

    }
}
