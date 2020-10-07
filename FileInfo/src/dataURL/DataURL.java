package dataURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import static javafx.scene.input.DataFormat.URL;

public class DataURL {
    public static void main(String args[]) throws MalformedURLException, IOException {
    URL url = new URL("https://myrusakov.ru");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String result = "";
        String line;
        while ((line = reader.readLine()) != null) {
            result += line + "\r\n";
        }
        reader.close();
        System.out.println(result);
    }
}
