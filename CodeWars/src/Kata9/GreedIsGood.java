package Kata9;

import java.util.Arrays;
import java.util.Comparator;

public class GreedIsGood {
    public static void main(String[] args) {
    int[] mass = {1,1,1,3,1};
    int result = 0;

       // Arrays.sort(mass);

    for (int i = 0; i < mass.length; i++) {
       for (int j = 0; j < mass.length; j++) {
           int cash = mass[i];
           if (mass[j] > mass[i]) {
               mass[i] = mass[j];
               mass[j] = cash;
           }
       }
    }

    for (int i = 0; i < mass.length; i++) {
        boolean combo = false;
        if (i + 2 <= mass.length) {
            if (mass[i + 1] == mass[i] && mass[i + 2] == mass[i]) combo = true;
        }
        result += strike(mass[i], combo);
        if (combo) i = i + 2;
    }
    }
    public static int strike(int i, boolean combo) {
        int result = 0;
        if (combo) {
            if (i == 1) result = 1000;
            else result = i * 100;
        }
        else {
            switch (i) {
                case 1:
                    result = 100;
                    break;
                case 5:
                    result = 50;
                    break;
                default:
                    result = 0;
            }
        }
        return result;
    }
}
