package Kata4;

public class Main {

    public static String SongDecoder (String song)
    {
        String result = "";
        String s;
        s = song.replaceAll("WUB", " ");
        String [] substr;
        String delim = " ";
        substr = s.split(delim);
        for (int i = 0; i < substr.length; i++) {
            if (substr[i].contains(" ") || substr[i].length() == 0) continue;
            result += substr[i];
            if (i < substr.length - 1) result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
    System.out.println(SongDecoder("WUBWUBABCWUB"));
        System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
        System.out.println(SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }
}

/*
public class Dubstep {
  public static String SongDecoder (String song)
  {
     return song.replaceAll("(WUB)+", " ").trim();
  }
}
 */
