package grapgicsshape;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class GraphicsShape extends JFrame {

    public static void main(String[] args) {
	// write your code here
        new GraphicsShape();
    }

    public GraphicsShape() {
    super("Графика");
    setBounds(600, 400, 850, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    }
    public void paint(Graphics g) {
    super.paint(g);
    Graphics g2 = (Graphics2D) g;
    //g2.drawRect(100, 100, 200, 200);
        g2.drawLine(20, 40, 200, 200);
        Color oldColor = g2.getColor();
        System.out.println(oldColor);
        Color newColor = new Color(255, 0,0);
        g2.setColor(newColor);
        g2.drawLine(20, 40, 150, 200);
        g2.setColor(oldColor);
        g2.drawRect(150, 250, 100, 20);
        g2.setColor(newColor);
        g2.fillRect(151, 251, 99, 19);
        g2.setColor(oldColor);
        g2.drawRoundRect(20, 90,240,50, 30,40);
        g2.drawOval(300, 300, 60, 60);
        g2.drawOval(300, 300, 60, 60);
        //g2.setStroke(new BasicStroke());
        ((Graphics2D) g).setStroke(new BasicStroke(5));
        g2.drawArc(150, 100, 40, 50, 0, 90);
        g2.drawArc(150, 100, 40, 50, 0, -90);
        ((Graphics2D) g).setStroke(new BasicStroke(1));
        int[] arrayX = {30, 120, 180, 270};
        int[] arrayY = {180, 180, 200, 250};
        Polygon p = new Polygon(arrayX, arrayY, arrayX.length);
        g2.drawPolygon(p);
        newColor = new Color(0, 255, 0);
        g2.setColor(newColor);
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 40);
        g2.setFont(font);
        g2.drawString("Hello world", 270, 120);
        ((Graphics2D) g).setPaint(new GradientPaint(0, 0, Color.BLUE, 100, 200, Color.RED, true));
        ((Graphics2D) g).fill(new Ellipse2D.Double(50, 50, 200, 100));
        for (int i = 0; i < 100; i++) {
            Color randColor = new Color(
                    (int) Math.ceil(Math.random() * 255),
                    (int) Math.ceil(Math.random() * 255),
                    (int) Math.ceil(Math.random() * 255)
            );
            g2.setColor(randColor);
            int x = (int) Math.ceil(Math.random() * getSize().width);
            int y = (int) Math.ceil(Math.random() * getSize().height - 50) + 50;
            g2.fillOval(x, y, 15, 15);
        }

    }
}
