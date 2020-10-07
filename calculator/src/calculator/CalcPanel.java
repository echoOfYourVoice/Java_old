package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcPanel extends JPanel {

    private JPanel panel;
    private boolean start;
    private JButton display;
    private double result;
    private String lastCommand = "=";

    public CalcPanel() {
        super();
        result = 0;
        start = true;
        setLayout(new BorderLayout());
        display = new JButton("0");
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        InsertAction insertAction = new InsertAction();
        CommandAction commandAction = new CommandAction();

        addButton("7", insertAction);
        addButton("8", insertAction);
        addButton("9", insertAction);
        addButton("/", commandAction);

        addButton("4", insertAction);
        addButton("5", insertAction);
        addButton("6", insertAction);
        addButton("*", commandAction);

        addButton("1", insertAction);
        addButton("2", insertAction);
        addButton("3", insertAction);
        addButton("-", commandAction);

        addButton("0", insertAction);
        addButton(".", insertAction);
        addButton("=", commandAction);
        addButton("+", commandAction);

        add(panel, BorderLayout.CENTER);

    }

    private void addButton(String label, ActionListener actionListener) {
        JButton button = new JButton(label);
        button.addActionListener(actionListener);
        panel.add(button);
    }

    private class InsertAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String input = actionEvent.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            if (display.getText() == "" && input == ".") display.setText(display.getText() + "0.");
            if (!input.equals(".") || display.getText().indexOf(".") == -1) display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        if (start) {
            lastCommand = command;
        } else {
            calc(Double.parseDouble(display.getText()));
            lastCommand = command;
            start = true;
        }
        }
    }

    private void calc(double x) {
        switch (lastCommand) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "*":
                result *= x;
                break;
            case "/":
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
        display.setText("" + result);
    }

}
