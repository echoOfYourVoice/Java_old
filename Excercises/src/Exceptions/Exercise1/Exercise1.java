package Exceptions.Exercise1;

public class Exercise1 {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 9;
        arr[2] = -1;
        arr[3] = 6;
        arr[4] = 1;
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Завершение программы.");
        }
    }
}
