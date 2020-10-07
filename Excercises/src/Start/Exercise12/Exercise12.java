package Start.Exercise12;


public class Exercise12 {

    public static void main(String[] args) {
        // write your code here
        double result = 0;
        Double[] mass = new Double[5];
        System.out.println("Массив");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = Math.random();
            System.out.println(mass[i]);
        }
        System.out.println("-------------------------------------");
        int i = 0;
        while (i < mass.length) {
            result += mass[i];
            i++;
        }
        System.out.println("Результат через цикл «while» " + result);
        result = 1;
        for (double d : mass) result *= d;
        System.out.println("Результат через цикл «for» " + result);
    }

}

