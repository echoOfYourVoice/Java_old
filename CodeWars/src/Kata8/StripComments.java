package Kata8;

public class StripComments {
    public static void main(String args[]) {
        String[] s = {"#", "!"};
    StripComments("apples, pears # and bananas\ngrapes\nbananas !apples", s);
    }
    public static String StripComments(String text, String[] commentSymbols) {
        String result = "";
        String[] substr;
        String delimeter = " ";
        substr = text.split(delimeter);
        for (int i = 0; i < substr.length - 1; i++) {
            boolean close = false;
            for (int j = 0; j < commentSymbols.length; j++) {
                if (substr[i ].equals(commentSymbols[j])) {
                    close = true;
                    i = i + 2;
                    break;
                }
            }
            if (!close) {
                result += substr[i];
                result += " ";
            }
        }
        result.trim();
        return result;
    }
}