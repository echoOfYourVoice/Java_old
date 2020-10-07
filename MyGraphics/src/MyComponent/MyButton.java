package MyComponent;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JComponent {
    private String title;
    private Color color = Color.BLACK;

    public MyButton(String title) {
        this.title = title;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Arial", Font.BOLD, 20);
        FontMetrics metrics = g.getFontMetrics(font);
        int x = (getWidth() - metrics.stringWidth(title)) / 2;
        int y = ((getHeight() - metrics.getHeight()) / 2) + metrics.getAscent();
        g2.setFont(font);
        g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        g2.setColor(color);
        g2.drawString(title, x, y);
    }

}
