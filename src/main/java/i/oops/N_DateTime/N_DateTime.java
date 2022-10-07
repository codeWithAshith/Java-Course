package i.oops.N_DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class N_DateTime {

    public static void main(String[] args) {
        datetime();
    }

    public static void datetime() {
        Thread datetime = new Thread(() -> {
            try {
                for (; ; ) {
                    Calendar cal = new GregorianCalendar();
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int month = cal.get(Calendar.MONTH);
                    int year = cal.get(Calendar.YEAR);
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    System.out.println("Time " + hour + ":" + minute + ":" + second + " " + "Date" + year + "/" + month + "/" + day);
                    Thread.sleep(1000);
                }
            } catch (Exception ignored) {
            }
        });
        datetime.start();
    }

}
