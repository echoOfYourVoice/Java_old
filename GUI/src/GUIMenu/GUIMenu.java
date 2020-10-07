package GUIMenu;

import javax.swing.*;


public class GUIMenu {
    public static void main(String args[]) {


        JFrame frame = new JFrame("Моя программа");
        MyListener listener = new MyListener(frame);
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();
        JMenu main = new JMenu("Программа");
        JMenuItem exit = new JMenuItem("Выход");
        main.add(exit);
        mb.add(main);

        JMenu bg = new JMenu("Фон");

        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem yellow = new JMenuItem("Желтый");
        JMenuItem def = new JMenuItem("Стандартный");
        bg.add(def);
        bg.add(blue);
        bg.add(yellow);
        mb.add(bg);
        JMenu submenu = new JMenu("Подменю");
        bg.add(submenu);
        JMenuItem submenuItem = new JMenuItem("Пункт в подменю");
        submenu.add(submenuItem);
        submenu.addSeparator();
        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("ЧекБокс");
        submenu.add(checkBoxMenuItem);
        frame.setJMenuBar(mb);

        exit.addActionListener(listener);
        blue.addActionListener(listener);
        yellow.addActionListener(listener);
        def.addActionListener(listener);
        submenuItem.addActionListener(listener);
        checkBoxMenuItem.addActionListener(listener);

        frame.setVisible(true);
    }
}
