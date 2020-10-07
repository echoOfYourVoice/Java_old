package myanimation2;

import org.w3c.dom.css.Rect;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Animation extends JFrame {
    int maxSize;
    int cashSize;
    File[] images;
    public static void main(String[] args) {
      new Animation();
    }

    public Animation() {
        super("My animation");
        Dimension sSize = Toolkit.getDefaultToolkit().getScreenSize();
        sSize.height -= 30;
        setSize(sSize);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D) g;
        Rectangle rect = this.getBounds();
        int size = (int) (50 + Math.random() * 300);
        //graphics2D.drawRect(rect.width / 2 /*+ size / 2*/, rect.height / 2 /*+ size / 2*/, size, size);

        /*
        ЛЕВАЯ ВЕРХНЯЯ ЧАСТЬ
         */
        graphics2D.setColor(new Color(255, 0, 0));
        graphics2D.drawRect(9, 33, rect.width / 2 - 9, rect.height / 2);
        //width - 1271 height 525

        /*
        ПРАВАЯ ВЕРХНЯЯ ЧАСТЬ
         */

        graphics2D.setColor(new Color(0, 255, 0));
        graphics2D.drawRect(rect.width / 2, 33, rect.width / 2 - 9, rect.height / 2);

        /*
        НИЖНЯЯ ЛЕВАЯ ЧАСТЬ
         */

        graphics2D.setColor(new Color(0, 0, 255));
        graphics2D.drawRect(9, rect.height / 2 + 33, rect.width / 2 - 9, rect.height / 2 - 45);

        /*
        НИЖНЯЯ ПРАВАЯ ЧАСТЬ
         */

        graphics2D.setColor(new Color(100, 156, 255));
        graphics2D.drawRect(rect.width / 2, rect.height / 2 + 33, rect.width / 2 - 9, rect.height / 2 - 45);
        //graphics2D.drawRect(300, 400, size, size);



            graphics2D.setColor(new Color(0,0,0));
            //graphics2D.drawRect(rect.width / 2 - size, rect.height / 2 + 33 - size, size, size);

            //graphics2D.drawRect(rect.width / 2, rect.height / 2 + 33 - size, size, size);
            //graphics2D.drawRect(rect.width / 2 - size, rect.height / 2 + 33, size, size);
        while (size % 4 != 0) {
            size++;
        }
        int sumSize = 0;
            graphics2D.drawRect(rect.width / 2, rect.height / 2 + 33, size, size);
            sumSize += size;
            maxSize = size;
            cashSize = maxSize;
            File dir = new File("D:\\backup_Windows\\backup_Windows\\Wallpapers");
            images = dir.listFiles();
        recursePaint(rect.width, rect.height, sumSize, graphics2D);
            


        //graphics2D.drawRect(rect.width / 2 - size / 2, rect.height / 2 - size / 2 + 33, size, size);
    }
    public void recursePaint(int width, int height, int sumSize, Graphics2D graphics2D) {
        while (width / 2 + sumSize < width) {
        //while (true) {
                int size = (int) (maxSize / 4 + Math.random() * (maxSize - maxSize / 2));
                while (cashSize / size > 4 && size % 4 != 0) {
                    size++;
                }
                while (maxSize % size != 0 && sumSize <= maxSize) size = (int) (maxSize / 4 + Math.random() * (maxSize - maxSize / 2));
                if (width / 2 + sumSize + size > width) {
                    size = width - (width / 2 + sumSize);
                }
                //graphics2D.drawRect(width / 2 + sumSize, height / 2 + 33, size, size);
            Image imageIO = null;
            try {
                imageIO = ImageIO.read(images[(int) (Math.random() * images.length - 1)]);
            } catch (Exception e) {
                /////////////////////////////////////////////
            }
            drawImage(graphics2D, imageIO, width, height, size, sumSize);

                sumSize += size;
                //break;
        }
    }
    public void drawImage(Graphics2D graphics2D, Image imageIO, int width, int height, int size, int sumSize) {
        graphics2D.drawImage(imageIO, width / 2 + sumSize,height / 2 + 33, size, size, null);
        graphics2D.setComposite(AlphaComposite.Src);
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    }
}
