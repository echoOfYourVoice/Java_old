package Kata1;

public class Main {

    public static void main(String[] args) {
	System.out.println(disemvowel("This website is for losers LOL!"));
    }
    public static String disemvowel(String str) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < vowels.length; i++) {
        str = str.replace(vowels[i], "");
        str = str.replace(vowels[i].toUpperCase(), "");
        }

        return str;
    }
    /*
    public class Troll {
        public static String disemvowel(String Z) {
            return Z.replaceAll("(?i)[aeiou]" , "");
        }
    }
     */
}
