package Test;

import Start.Exercise10.Input;

public class Spiral {
    public static void main(String args[]) {
        Input in = new Input();
        int length = Integer.parseInt(in.getInput());
        int[][] mass = new int[length][length];
        int c = 1;
            for (int i = 0; i < mass.length; i++) {
                mass[0][i] = c;
                c++;
            }

            for (int i = 1; i < mass.length; i++) {
                mass[i][mass.length - 1] = c;
                c++;
            }

            for (int i = mass.length - 2; i >= 0; i--) {
                mass[mass.length - 1][i] = c;
                c++;
            }

            for (int i = mass.length - 2; i > 0; i--) {
                mass[i][0] = c;
                c++;
            }
            int x = 1;
            int y = 1;



            while (c < length * length) {
                //вправо
                while (mass[x][y] == 0) {
                    mass[x][y] = c;
                    c++;
                    y++;
                }

                //вниз
                while (mass[x + 1][y - 1] == 0) {
                    mass[x + 1][y - 1] = c;
                    c++;
                    x++;
                }

                //влево
                while (mass[x][y - 2] == 0) {
                    mass[x][y - 2] = c;
                    c++;
                    y--;
                }

                //вверх

                while (mass[x - 1][y - 1] == 0) {
                    mass[x - 1][y - 1] = c;
                    c++;
                    x--;
                }
            }

            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    if (mass[i][j] == 0) mass[i][j] = c;
                }
            }


            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    System.out.print(mass[i][j]);
                    if (mass[i][j] > 9) {
                        System.out.print(" ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        int i = Integer.parseInt(in.getInput());
        int j = Integer.parseInt(in.getInput());
        int el = mass[i - 1][j - 1];
        System.out.println("Элемент матрицы с координатами i: " + i + ", j: " + j + " = " + el);
        }
}

       /*
        int lng = 6;
        int[][] tbl = new int[lng][lng];
        int x = 0;
        int y = lng - 1;
        int ctr = 1;

        while (ctr <= lng * lng) {
            for (int i = 0; i < tbl.length; i++) {
                if (tbl[x][i] == 0) {
                    tbl[x][i] = ctr++;
                }
            }

            for (int i = 0; i < tbl.length; i++) {
                if (tbl[i][y] == 0) {
                    tbl[i][y] = ctr++;
                }
            }

            for (int i = tbl.length - 1; i >= 0; i--) {
                if (tbl[y][i] == 0) {
                    tbl[y][i] = ctr++;
                }
            }

            for (int i = tbl.length - 1; i >= 0; i--) {
                if (tbl[i][x] == 0) {
                    tbl[i][x] = ctr++;
                }
            }

            x++;
            y--;
        }

        for (int i = 0; i < tbl.length; i++) {
            for (int j = 0; j < tbl.length; j++) {
                System.out.printf("%2d ", tbl[i][j]);
            }
            System.out.println("");
        }

    }
    */
