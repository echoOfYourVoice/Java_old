package readfile;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
    String path = "src/readfile/text.txt";
    try {
        System.out.println("FileInputStream");
        FileInputStream in = new FileInputStream(path);
        int b = in.read();
        while (b != -1) {
            System.out.print((char) b);
            b = in.read();
        }
        in.close();
        System.out.println("FileReader посимвольно");
        FileReader input = new FileReader(path);
        int code = input.read();
        while (code != -1) {
            System.out.print((char) code);
            code = input.read();
        }
        input.close();
        System.out.println();
        System.out.println("FileReader буферно");

        input = new FileReader(path);
        char[] chars = new char[4096];
        input.read(chars);
        input.close();
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        System.out.println("BufferReader");
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
        System.out.println(line);
        }
        reader.close();
    } catch (FileNotFoundException ex) {

    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
