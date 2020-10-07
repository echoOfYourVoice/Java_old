package Objects.ObjectDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//
public class Main {

    public static void main(String[] args) throws ParseException {
	// write your code here
        Date d = new Date();
        System.out.println(d);
        Calendar c = new GregorianCalendar();
        //c.setTime(new Date()); Текущее время
        System.out.println(c.getTimeInMillis());
        c.set(1980, 12, 12 ,14, 0, 30);
        System.out.println(c.getTimeInMillis()); //милисекунды 0,001 секунды
        c.set(GregorianCalendar.YEAR, 2020);
        c.set(GregorianCalendar.MONTH, 10);
        c.set(GregorianCalendar.DAY_OF_MONTH, 5);
        c.set(GregorianCalendar.HOUR, 22);
        c.set(GregorianCalendar.MINUTE, 15);
        c.set(GregorianCalendar.SECOND, 27);
        System.out.println(c.getTimeInMillis()); //милисекунды 0,001 секунды
        System.out.println(c.get(GregorianCalendar.MONTH));

        String date = "15.12.2015 12:00:00";
        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy HH:mm:ss");
        d = format.parse(date);
        c.setTime(d);
        System.out.println(c.get(GregorianCalendar.YEAR));
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm_секунд=ss").format(d));
    }
}
