package Kata5;

public class Main {

    public static String longestConsec(String[] strarr, int k) {
        String maxValue = "";
        if (strarr.length == 0 || k > strarr.length || k <= 0) return "";
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].length() > maxValue.length()) maxValue = strarr[i];
            String sWord = "";
            for (int j = i; j < k + i; j++) {
            sWord += strarr[j];
            if (j == strarr.length - 1) break;
            }
            if (sWord.length() > maxValue.length()) maxValue = sWord;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
        System.out.println(longestConsec(new String[] {}, 3));
        System.out.println(longestConsec(new String[] {"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
        System.out.println(longestConsec(new String[] {"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas"}, -2));
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 15));
        System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 0));
    }

}
/*
class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0 || k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
 */
