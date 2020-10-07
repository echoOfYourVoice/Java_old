package myanimation1;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class Collage extends JFrame {
    private boolean painted = false;
    private boolean firstPicture = true;
    private int maxSize = 0;

    public static void main(String args[]) {
    new Collage();
    }

    public Collage() {
        super("4");
        setBounds(0, 0, 2560, 1040);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void paint(Graphics g) {
        if (painted) return;
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        recursivePaint(graphics2D, 9, 33, 2550, 1040);
    }

    public void recursivePaint(Graphics2D graphics2D, int startX, int startY, int maxX, int maxY) {
        while (startX < maxX) {
            firstPicture = true;
            while (startY < maxY) {
                int size = (int) (100 + Math.random() * 300);
                if (firstPicture) {
                    maxSize = size;
                } else {
                    while (size > maxSize / 2) {
                        size = (int) (20 + Math.random() * 150);
                    }
                }
                //graphics2D.drawRect(startX, startY, size, size);
                try {
                    File dir = new File("D:\\backup_Windows\\backup_Windows\\Wallpapers");
                    File[] allFiles = dir.listFiles();
                    Image imageIO = ImageIO.read(allFiles[(int) (Math.random() * allFiles.length)]);
                    graphics2D.drawImage(imageIO, startX, startY, size, size, null);
                } catch (Exception e) {
                    //////////////////
                }
                if (!firstPicture) {
                    int startXRow = startX + size;
                    int maxXRow = maxSize + startX;
                    while (startXRow < maxXRow) {
                        while (size > maxSize / 2) {
                            size = (int) (20 + Math.random() * 200);
                        }

                        try {
                            File dir = new File("D:\\backup_Windows\\backup_Windows\\Wallpapers");
                            File[] allFiles = dir.listFiles();
                            Image imageIO = ImageIO.read(allFiles[(int) (Math.random() * allFiles.length)]);
                            graphics2D.drawImage(imageIO, startXRow, startY, startXRow + size > maxXRow ? maxXRow - startXRow : size, size, null);
                        } catch (Exception e) {
                            //////////////////
                        }
                        startXRow += size;
                    }
                };
                firstPicture = false;
                startY += size;
            }
            startY = 33;
            startX += maxSize;
            /////////////////////////////////
        }
        painted = true;
    }
}
