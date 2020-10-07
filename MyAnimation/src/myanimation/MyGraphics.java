package myanimation;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class MyGraphics extends JFrame {

    private boolean painted = false;
    private boolean firstInRow = true;
    private boolean firstInColumn = true;

    public static void main(String[] args) {
        new MyGraphics();
    }

    public MyGraphics() {
        super("Графика");
        setBounds(0, 0, 1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void paint(Graphics g) {

        if (painted) return;
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        recursivePaint(9, 33, 0, graphics2D, 1000, 1000);
    /*
        int startX = 9;
        int startY = 33;
        int maxSize = 0;
        boolean firstInRow = true;


        while (true) {
            if (startX >= 990) {
                startY += startY + (maxSize - startY);
                startX = 9;
                firstInRow = true;
                maxSize = 0;
            }
            if (startY >= 967) {
                break;
            }
            int size = getRandom(200);
            size = size % 2 != 0 ? size++ : size;

            if (size > maxSize) {
                if (firstInRow) {
                    while (size < 50) {
                        size = getRandom(200);
                    }
                    maxSize = size;
                }
                else {
                    while (size > maxSize / 2) {
                        size = getRandom(100);
                    }
                }

                if (size + startX >= 990) size = 990 - startX;
                if (size + startY >= 1000) {
                    size = 967 - startY;
                }
                if (size <= 0) continue;
                //graphics2D.drawRect(startX, startY, size, size);

                try {
                    Image imageIO = ImageIO.read(new File("D:\\backup_Windows\\backup_Windows\\Новая папка\\Xf3shCF.jpg"));
                    graphics2D.drawImage(imageIO, startX, startY, size, size, null);

                } catch (Exception e) {
                    //////////////////
                }
                int cashSize = size;
                int sizeColumn = 0;
                sizeColumn += size;

                while (sizeColumn < maxSize) {
                     size = (int) (Math.random() * cashSize);
                    while (size > cashSize / 2) size = cashSize - size;
                   // if (size + sizeColumn > cashSize) size = cashSize - sizeColumn;
                   // if (size == 0) continue;
                    //graphics2D.drawRect(startX, startY + sizeColumn, size, size);
                    try {
                        Image imageIO = ImageIO.read(new File("D:\\backup_Windows\\backup_Windows\\Новая папка\\Xf3shCF.jpg"));
                        graphics2D.drawImage(imageIO, startX, startY + sizeColumn, size, size, null);
                    } catch (Exception e) {
                        System.out.println("123");
                    }
                    sizeColumn += size;
                }


                firstInRow = false;
                startX += cashSize;
//                startY += cashSize;
            }
        }
        painted = true;
*/
    }

    public int getRandom(int factor) {
        return (int) ((factor / 2) + Math.random() * factor);
    }

    public void recursivePaint(int startX, int startY, int maxSize, Graphics2D graphics2D, int maxY, int maxX) {
        while (true) {

            if (startY >= maxY) {
                break;
            }
            int size = getRandom(200);
            if (size > maxSize) {
                if (firstInColumn) {
                    while (size < 50) {
                        size = getRandom(200);
                    }
                    maxSize = size;
                } else {
                    while (size > maxSize ) {
                        size = getRandom(100);
                    }
                }
            }
            if (size + startX >= 1000) size = maxX - startX;
            if (size + startY >= 1000) size = maxY - startY;
            if (size <= 0) break;
            try {
                Image imageIO = ImageIO.read(new File("D:\\backup_Windows\\backup_Windows\\Новая папка\\Xf3shCF.jpg"));
                graphics2D.drawImage(imageIO, startX, startY, size, size, null);

            } catch (Exception e) {
                //////////////////
            }
            firstInColumn = false;
            if(startX < maxX) {
                maxX = startX + size;
                recursivePaint(startX + size, startY, size, graphics2D, startY + size, maxX);
            }
            maxSize = size;
            startY += size;
        /*
        while (true) {
            if (startX >= maxX) {
                startY += startY + (maxSize - startY);
                startX = 9;
                firstInRow = true;
                maxSize = 0;
            }
            if (startY >= maxY) {
                break;
            }
            int size = getRandom(200);

            if (size > maxSize) {
                if (firstInRow) {
                    while (size < 50) {
                        size = getRandom(300);
                    }
                    maxSize = size;
                } else {
                    while (size > maxSize / 2) {
                        size = maxSize / 2; //getRandom(100);
                    }
                }
            }
                if (size + startX >= maxX) size = maxX - startX;
                if (size + startY >= maxY) size = maxY - startY;
                if (size <= 0) continue;
                //graphics2D.drawRect(startX, startY, size, size);

                try {
                    Image imageIO = ImageIO.read(new File("D:\\backup_Windows\\backup_Windows\\Новая папка\\Xf3shCF.jpg"));
                    graphics2D.drawImage(imageIO, startX, startY, size, size, null);

                } catch (Exception e) {
                    //////////////////
                }
            if (!firstInRow && startY + size < maxY && startX + size < maxX) {
                recursivePaint(startX, startY + size, size, graphics2D, maxSize + startY, maxSize + startX);
            }
            startX += size;
            firstInRow = false;
            }
        painted = true;
        */
        }
    }
}
