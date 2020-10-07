package Kata3;

public class Main {

    public static void main(String[] args) {
    duplicateCount("abcde");
    duplicateCount("aabbcde");
   duplicateCount("indivisibility");
    }
    public static int duplicateCount(String text) {
        int res = 0;
        for (int i = 0; i < text.length(); i++) {
            res = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) res += 1;
            }
            System.out.println(text.charAt(i) + " " + res);
        }
        return res;
    }
}
