package nursalim.dev.datetime;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    @Test
    void testCreate(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testModifyCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1983);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 30);

        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void testGetDataCalendar(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);



    }
}
