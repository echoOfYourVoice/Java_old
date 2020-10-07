package GUILayOut;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GUILayOut {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0)); //Установка рамки (параметры отступы)
        JLabel labeltitle = new JLabel("Моя форма");
        labeltitle.setFont(new Font("Arial", Font.BOLD, 22)); //Установка размера шрифта
        top.add(labeltitle);

        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Имя: ");
        JTextField nameTF = new JTextField();
        JLabel emailL = new JLabel("E-Mail: ");
        JTextField emailTF = new JTextField();

        nameL.setHorizontalAlignment(SwingConstants.RIGHT);
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);
        nameTF.setPreferredSize(new Dimension(200, 25));
        emailTF.setPreferredSize(new Dimension(200, 25));
       // form.add(nameL);
       // form.add(nameTF);
       // form.add(emailL);
       // form.add(emailTF);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 5);
        form.add(nameL, c);
        c.gridx = 1;
        form.add(nameTF, c);
        c.gridx = 0;
        c.gridy = 1;
        form.add(emailL, c);
        c.gridx = 1;
        form.add(emailTF, c);

        JPanel bottom = new JPanel();
        JCheckBox news = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("Отправить");
        button.setPreferredSize(new Dimension(200, 50));
        //bottom.setLayout(new BorderLayout());
        bottom.add(news);
        bottom.add(button, BorderLayout.SOUTH);
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0)); //Установка рамки (параметры отступы)

        frame.add(top, BorderLayout.NORTH);
        frame.add(form, BorderLayout.CENTER);
        frame.add(bottom, BorderLayout.SOUTH);

        frame.setVisible(true);

    }
}
