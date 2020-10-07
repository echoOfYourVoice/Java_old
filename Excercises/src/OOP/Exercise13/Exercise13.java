package OOP.Exercise13;

import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        // write your code here
        Integer[] mass = new Integer[10];
        mass[9] = 3;
        mass[0] = 4;
        mass[3] = 8;
        mass[8] = 15;
        mass[1] = 16;
        mass[7] = 23;
        mass[2] = 45;
        mass[6] = 69;
        mass[4] = 82;
        mass[5] = 100;

        Arrays.sort(mass, (i1, i2) -> Integer.compare(i1, i2));
        for (int i : mass) System.out.println(i);

    }
}
