package Start.Exercise11;


import javax.swing.*;

public class Exercise11 {

    public static void main(String[] args) {
        // write your code here
        double result;
      boolean bool = true;
        Input input1 = new Input();
      bool = input1.parseToDoubleData(input1.getData());
      if (!bool) {
          return;
      }
      Input input2 = new Input();
      bool = input2.parseToDoubleData(input2.getData());
      if (!bool) {
          return;
      }
      Arithmetic arithmetic = new Arithmetic();

      bool = arithmetic.analizeArithmetic(arithmetic.getData());
      if (!bool) {
          return;
      }

      switch (arithmetic.getData()) {
          case ("+"):
              result = Double.parseDouble(input1.getData()) + Double.parseDouble(input2.getData());
              break;
          case ("-"):
              result = Double.parseDouble(input1.getData()) - Double.parseDouble(input2.getData());
              break;
          case ("*"):
              result = Double.parseDouble(input1.getData()) * Double.parseDouble(input2.getData());
              break;
          case ("/"):
              result = Double.parseDouble(input1.getData()) / Double.parseDouble(input2.getData());
              break;
          default:
              JOptionPane.showMessageDialog(null, "Не выбрана арифметическая операция");
              return;
      }
      JOptionPane.showMessageDialog(null, "Результат: " + result);
    }
}

