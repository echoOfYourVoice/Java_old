package Kata6;

public class Main {

    public static void main(String[] args) {
    System.out.println(spinWords("Welcome"));
    System.out.println(spinWords("Hey fellow warriors"));
    System.out.println(spinWords("This is a test"));
    }

    public static String spinWords(String sentence) {
        String r = " ";
        String result = "";
        String[] words = sentence.split(r);
        for (int i = 0; i < words.length; i++) {
            if (words.length > 1 && words[i].length() <= 4) {
                result += words[i];
                if (i < words.length - 1) result += " ";
                continue;
            }
            char[] chars = words[i].toCharArray();
            int count = chars.length - 1;
            while (count >= 0) {
                result += chars[count];
                count--;
            }
            if (i < words.length - 1) result += " ";
        }
        return result;
    }

}
/*
public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    for (int i=0; i<words.length; i++) {
      if (words[i].length() >= 5) {
        words[i] = new StringBuilder(words[i]).reverse().toString();
      }
    }
    return String.join(" ",words);
  }
}
 */
