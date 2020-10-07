package testthreads;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            createGUI();
        }
    });
    }
    public static void createGUI() {
        JFrame frame = new JFrame("Тест");
        JPanel panel = new JPanel();
        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100000);
        progressBar.setStringPainted(true);
        panel.add(progressBar);
        
        JButton button = new JButton("Тест");
        button.addActionListener(actionEvent -> {
            int value = progressBar.getValue() + 100;
            progressBar.setValue(value);
            System.out.println(progressBar.getValue());
        });
        panel.add(button);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
