package MyComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyComponent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Изображение");
        frame.setBounds(600, 400, 850, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MyButton myButton = new MyButton("Моя кнопка");
        myButton.setPreferredSize(new Dimension(200, 100));
        myButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        myButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println("Кнопка нажата");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            MyButton button = (MyButton) mouseEvent.getSource();
            button.setColor(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                MyButton button = (MyButton) mouseEvent.getSource();
                button.setColor(Color.BLACK);
            }
        });
        frame.add(myButton);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
