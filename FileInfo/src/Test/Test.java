package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Test extends JFrame{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Choose directory");
        JButton fc = new JButton("Выбрать файл");
        fc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(frame);
                File file = fileChooser.getSelectedFile();
                label.setText(file.getAbsolutePath());
            }
        });
        panel.add(label);
        panel.add(fc);
        JButton button = new JButton("Прочитать");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(new File(label.getText())));
                    String s;
                    while ((s = reader.readLine()) != null) {
                      System.out.println(s);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        panel.add(button);

        JButton copy = new JButton("Копировать");
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                File distr = new File("src/dir");
                if (!distr.exists()) distr.mkdir();
                try {
                    FileInputStream inputStream = new FileInputStream(new File(label.getText()).getAbsolutePath());
                    FileOutputStream outputStream = new FileOutputStream((distr.getName().substring(distr.getName().length() - 1).equals("/") ? distr : distr + "/") + new File(label.getText()).getName());
                    byte[] bytes = new byte[4096];
                    while (inputStream.read(bytes) != -1) {
                        outputStream.write(bytes);
                    }
                    inputStream.close();
                    outputStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        panel.add(copy);
        frame.add(panel);
        frame.setVisible(true);
    }

}
