package TestKata1;

public class Main {

    public static void main(String[] args) {
    int[] mass = {1000, 10, 1, 2, 4, 6, 12, 100, 3, 5};
    for (int i = 0; i < mass.length; i++) {
        for (int j = 0; j < mass.length - 1; j++) {
            int massK = mass[j];
            if (massK > mass[j + 1]) {
                mass[j] = mass[j + 1];
                mass[j + 1] = massK;
            }
        }
    }
    for (int s : mass) System.out.print(s + " ");
    }
}
