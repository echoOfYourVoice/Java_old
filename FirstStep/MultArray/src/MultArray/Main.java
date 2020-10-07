package MultArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[][] arr = new char[2][2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'c';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Элемент с индексом " + i + ", " + j + " = " + arr[i][j]);
            }
        }
        int[][] table = new int[9][9];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("   1  2  3  4  5  6  7  8  9");
        for (int i = 0; i < table.length; i++) {
            System.out.print((i + 1) + " ");
for (int j = 0; j < table[i].length; j++) {
    if (table[i][j] < 10) System.out.print(" ");
    System.out.print(table[i][j] + " ");
}
            System.out.println();
        }
    }
}
