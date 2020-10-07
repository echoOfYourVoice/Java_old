package GUIComponents;

import javax.swing.*;

public class GUIComponents {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Моя программа");
        frame.setBounds(300, 300, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Панель
        JPanel panel = new JPanel();

        //Кнопка
        JButton button = new JButton("Кнопка");
        panel.add(button);

        //Метка
        JLabel label = new JLabel("ТекстМетки");
        panel.add(label);

        //Checkbox
        JCheckBox check = new JCheckBox("Текст чекбокса");
        panel.add(check);

        //Текстовое поле
        JTextField field = new JTextField("Текст по умолчанию");
        panel.add(field);

        //Группа кнопок
        ButtonGroup bg = new ButtonGroup();

        //RadioButton
        JRadioButton rb_1 = new JRadioButton("Радио кнопка 1");
        JRadioButton rb_2 = new JRadioButton("Радио кнопка 2");
        bg.add(rb_1);
        bg.add(rb_2);
        panel.add(rb_1);
        panel.add(rb_2);

        //TextArea
        JTextArea ta = new JTextArea("Текст в текстовой области");
        panel.add(ta);

        //Строки таблицы
        String[][] data  = {{"1", "2"}, {"3", "4"}};

        //Столбцы таблицы
        String[] cols = {"Столбец 1", "Столбец2"};

        //Таблица
        JTable table = new JTable(data, cols);

        //Скролл таблицы + вн. вид
        JScrollPane scroll = new JScrollPane(table);
        panel.add(scroll);

        frame.add(panel);
        frame.setVisible(true);
    }
}
