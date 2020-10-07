package testthreads1;


import javax.swing.*;

public class MyPanel extends JPanel{
    Thread thread;
    Boolean isActive;
    public MyPanel() {
        super();
        JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);
        add(progressBar);

        JButton button = new JButton("Тест");
        button.addActionListener(actionEvent -> {
            isActive = true;
            thread = new Thread(() -> {
                for (int i = 0; i < progressBar.getMaximum(); i++) {
                    if (!isActive) break;
                    progressBar.setValue(progressBar.getValue() + 1);
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        });

        JButton button1 = new JButton("Стоп");
        button1.addActionListener(actionEvent ->  {
                isActive = false;
        });

        add(button);
        add(button1);
    }
}
