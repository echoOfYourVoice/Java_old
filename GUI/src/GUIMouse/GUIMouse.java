package GUIMouse;

import GUIMenu.MyListener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class GUIMouse {
    public static void main(String args[]) {

        JFrame frame  = new JFrame("Моя программа");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println("Клик мыши");
                System.out.println(mouseEvent.getX() + " " + mouseEvent.getY());
                if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
                    System.out.println("Клик левой кнопки мыши");
                }
                else if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
                    System.out.println("Клик правой кнопки мыши");
                }
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                //System.out.println("Кнопка мыши нажата");
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
                //System.out.println("Кнопка мыши отпущена");
            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                //System.out.println("Кнопка мыши на контейнере");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                //System.out.println("Кнопка мыши ушла с контейнера");
            }
        });

        frame.setVisible(true);
    }
}
