package Objects.Exercise3;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

    public static void main(String[] args) {
	// write your code here
        HashMap<String, Integer> h = new HashMap();
        h.put("Roman", 25);
        h.put("Anton", 24);
        h.put("Matt", 29);
        h.put("Todd", 45);
        h.put("Elise", 34);
        for(Map.Entry<String, Integer> d : h.entrySet()) {
            String key = d.getKey();
            int value = d.getValue();
            System.out.println(key + " = " + value);
        }
        h.put("Anton", h.get("Anton") + 4);
        System.out.println("------------------------------------");
        h.forEach((s, integer) -> System.out.println(s + " = " + integer));
    }
}
