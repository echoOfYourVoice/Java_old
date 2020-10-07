package Objects.Exercise5;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exercise5 {

    public static void main(String[] args) {
	// write your code here
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.getTimeInMillis());
        String userdate = JOptionPane.showInputDialog(null, "Введите дату в формате \"dd.MM.yyyy\"");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            if (userdate == null || userdate.equals("")) throw new Exception();
          date = format.parse(userdate);
          calendar.setTime(date);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,"Введен некорректный формат даты");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Введены некорректные данные");
            return;
        }
        calendar.set(GregorianCalendar.YEAR, calendar.get(GregorianCalendar.YEAR) + 1);
        JOptionPane.showMessageDialog(null, calendar.get(GregorianCalendar.YEAR) + "." + (calendar.get(GregorianCalendar.MONTH) + 1) + "." + calendar.get(Calendar.DAY_OF_MONTH));
    }
}
