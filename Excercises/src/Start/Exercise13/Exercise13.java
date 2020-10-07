package Start.Exercise13;


public class Exercise13 {

    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int result = 0;
        Integer[][] mass = new Integer[3][2];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = a;
                System.out.print(mass[i][j] + " ");
                result += mass[i][j];
                a++;
            }
            System.out.println();
        }
        System.out.println("Результат суммы всех чисел: " + result);
        Integer[] mass1 = new Integer[3];
        for (int i = 0; i < mass.length; i++) {
            result = 0;
            for (int j = 0; j < mass[i].length; j++) {
                result += mass[i][j];
            }
            System.out.println("Сумма элементов строки № " + (i + 1) + " = " + result);
        }
    }


}

