package Lambda;
import java.util.Comparator;
public class MyCompare implements Comparator<String> {
    @Override
    public int compare(String t, String t1) {
        return Integer.compare(t.length(), t1.length());
    }
}
