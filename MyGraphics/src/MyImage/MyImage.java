package MyImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MyImage {
    public static void main(String[] args) throws MalformedURLException, IOException {
        JFrame frame = new JFrame("Изображение");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

        Graphics2D g2 = (Graphics2D) frame.getGraphics();

        Image imageURL = ImageIO.read(new URL("https://cdn.pixabay.com/photo/2013/07/21/13/00/rose-165819__340.jpg"));
        Image imageFile = ImageIO.read(new File("src/images/xaMKWUGCnmU.jpg"));
        g2.drawImage(imageURL, 50, 50, null);
        Image imageSmall = imageFile.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        g2.drawImage(imageSmall, 100, 100, null);
    }
}
