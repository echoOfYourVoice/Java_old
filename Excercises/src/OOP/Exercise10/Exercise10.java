package OOP.Exercise10;

import OOP.Exercise1.User;
import OOP.Exercise7.MyLine;

public class Exercise10 {

    public static void main(String[] args) {
	// write your code here
        User user = new User() {
            @Override
            public void printUser() {
    System.out.println("Хех лол мда кек");
            }
        };
        user.printUser();
    }
}
