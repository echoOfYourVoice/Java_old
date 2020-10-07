package com.mygraphics;

import javax.swing.*;
import java.awt.*;

public class MyGraphics extends JFrame {

    public static void main(String[] args) {
	// write your code here
        new MyGraphics();
    }

    public MyGraphics() {
    super("Графика");
    setBounds(600, 400, 850, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    }
    public void paint(Graphics g) {
    super.paint(g);
    Graphics g2 = (Graphics2D) g;
    g2.drawRect(100, 100, 200, 200);
    }
}
