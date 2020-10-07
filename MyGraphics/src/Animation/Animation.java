package Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Animation extends JFrame implements KeyListener, ActionListener {

    private int x = 20;
    private int y = 200;
    final int DELTA = 10;
    private Timer timer;

public static void main(String[] args) {
    new Animation();
}
public Animation() {
    super("Анимация");
    setBounds(600, 400, 850, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    addKeyListener(this);
    setLayout(new FlowLayout());
    JButton button = new JButton("Старт");
    button.addActionListener((ae) -> {
        if (ae.getActionCommand() == "Старт") {
            button.setText("Стоп");
            timer.start();
        }
        else if (ae.getActionCommand() == "Стоп")  {
            button.setText("Старт");
            timer.stop();
        }
    });
    add(button);
    setVisible(true);
    timer = new Timer(250, this);
}
public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.GREEN);
    if (x + 50 > getSize().width) x = getSize().width - 50;
    if (y + 50 > getSize().height) x = getSize().height - 50;
    if (x < 0) x = 0;
    if (y < 0) y = 0;
    g2.fillRect(x, y, 50, 50);
}

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        //
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int code = keyEvent.getKeyCode();
        if (code == 38) y-= DELTA;
        else if(code == 39) x+= DELTA;
        else if(code == 40) y+= DELTA;
        else if(code == 37) x-= DELTA;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    //
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    x += 10;
    System.out.println(x);
    repaint();
    }
}
