package testthreads1;

import javax.swing.*;

public class TestThread {
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        JPanel panel = new MyPanel();
        frame.add(panel);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
