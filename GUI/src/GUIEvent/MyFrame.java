package GUIEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JTextField nameTF;
    private JTextField emailTF;
    private JCheckBox news;

    public MyFrame() {
        super("Моя программа");
        JFrame frame = new JFrame("Моя программа");
        setBounds(600, 400, 850, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setBorder(new EmptyBorder(20, 0, 0, 0)); //Установка рамки (параметры отступы)
        JLabel labeltitle = new JLabel("Моя форма");
        labeltitle.setFont(new Font("Arial", Font.BOLD, 22)); //Установка размера шрифта
        top.add(labeltitle);

        JPanel form = new JPanel();
        form.setLayout(new GridBagLayout());
        JLabel nameL = new JLabel("Имя: ");
        nameTF = new JTextField();
        JLabel emailL = new JLabel("E-Mail: ");
        emailTF = new JTextField();

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
        news = new JCheckBox("Подписаться на новости");
        JButton button = new JButton("Отправить");
        button.setPreferredSize(new Dimension(200, 50));
        //bottom.setLayout(new BorderLayout());
        bottom.add(news);
        bottom.add(button, BorderLayout.SOUTH);
        bottom.setBorder(new EmptyBorder(0, 0, 20, 0)); //Установка рамки (параметры отступы)

        add(top, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);

        button.addActionListener(this);
        news.addActionListener(this);
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            top.setBackground(Color.GREEN);
            form.setBackground(Color.RED);
            bottom.setBackground(Color.YELLOW);
            labeltitle.setForeground(Color.ORANGE);
            }
        });*/

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    // System.out.println(ae.getActionCommand());
     if (ae.getActionCommand().equals("Подписаться на новости")) {
         System.out.println("Нажат чекбокс");
     }
     else if (ae.getActionCommand().equals("Отправить")) {
         System.out.println("Нажата кнопка");
        String name = nameTF.getText();
        String email = emailTF.getText();
        boolean bnews = news.isSelected();
        try {
            User user = new User(name, email, bnews);
            User.add(user);
            User.printAllUsers();
        } catch (UserException e) {
        if (e.getCode() == UserException.NO_EMAIL) {
    showError("Вы не ввели e-mail");
        }
        else if (e.getCode() == UserException.NO_NAME) {
          showError("Вы не ввели имя");
        }
        else if (e.getCode() == UserException.ALREADY_EXIST) {
            showError("Пользователь с таким e-mail уже существует");
        }
        }
     }
    }
    private void showError(String text) {
    JOptionPane.showMessageDialog(this, text, "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
}
