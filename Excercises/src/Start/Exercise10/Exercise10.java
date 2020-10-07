package Start.Exercise10;

import javax.swing.*;

public class Exercise10 {

    public static void main(String[] args) {
        // write your code here
        boolean bool = true;
    Input inp = new Input();
    do {
        bool = inp.getInt(inp.getInput());
        if (bool == false) {
            JOptionPane.showMessageDialog(null, "Спасибо!");
            break;
        }
    } while (bool);
    }
}

