package Start.Exercise11;

import javax.swing.*;

public class Input {
    private String data;
    public Input() {
        data = JOptionPane.showInputDialog(null, "Введите число", "Введите число", JOptionPane.QUESTION_MESSAGE);
    }
    public boolean parseToDoubleData(String s) {
      if (s == null || s.equals("")) {
          JOptionPane.showMessageDialog(null, "Введены некорректные данные");
          return false;
      }
      return true;
    }

    public String getData() {
        return data;
    }
}
