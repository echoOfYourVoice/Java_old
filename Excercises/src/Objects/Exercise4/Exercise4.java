package Objects.Exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> array = new ArrayList();
        array.add("KEK");
        array.add("random");
        array.add("passion");
        array.add("burning");
        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        array.set(1, "измененный элемент");
        array.forEach(s -> System.out.print(s + " "));
    }
}
