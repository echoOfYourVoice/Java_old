package Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {
	// write your code here
        String[] arr = {"Hello", "Very long string", "MyWorld", "!"};
        Arrays.sort(arr, new MyCompare());
        for (String s : arr) System.out.println(s);
        System.out.println("----------------------");
        //Лямбда выражение, используется, только есть 1 метод
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length())); //в скобках параметры, дальше реализация
        for (String s : arr) System.out.println(s);
        List<String> arrNew = Arrays.asList("A", "AB", "ABC");
        arrNew.forEach((t) -> System.out.println(t));
        arrNew.forEach(System.out::println);

    }
}
