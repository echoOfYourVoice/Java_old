package WriteFile;

import javax.swing.*;
import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File dir = new File("src/dir");
        dir.mkdir();
        File file = new File((dir.getName().substring(dir.getName().length() - 1).equals("/") ? dir + "" : dir + "/") + "a.txt");
        file.createNewFile();
        FileWriter output = new FileWriter(file.getPath());
        String string = "Информация для файла \r\nНоваяСтрока";
        output.write(string);
        output.close();

        string = "Информация для файла \r\nНоваяСтрока\r\nBufferedWriter";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
        writer.write(string);
        writer.close();

        JFileChooser ch = new JFileChooser();
        int r = ch.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            File f = ch.getSelectedFile();
            FileInputStream input = new FileInputStream(f.getAbsolutePath());
            FileOutputStream outputStream = new FileOutputStream((dir.getName().substring(dir.getName().length() - 1).equals("/") ? dir : dir + "/") + f.getName());
           /*
            int b = input.read();
            while (b != -1) {
                outputStream.write(b);
                b = input.read();
            }
            */
           /*
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            outputStream.write(buffer);

            */
           byte[] buffer = new byte[4096];
           while (input.read(buffer) != -1) {
               outputStream.write(buffer);
           }
            input.close();
            outputStream.close();
            JOptionPane.showMessageDialog(null, "Копирование успешно завершено");
        }

    }
}
