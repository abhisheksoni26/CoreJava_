package JavaDateAndTimeFormatter;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class MaximumValueOfDate {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("Current Time : " + calendar.getTime());

        System.out.println("Maximum Year : " + calendar.getActualMaximum(Calendar.YEAR));
        System.out.println("Maximum Month : " + calendar.getActualMaximum(Calendar.MONTH));
        System.out.println("Maximum Week : " + calendar.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Maximum Date : " + calendar.getActualMaximum(Calendar.DATE));
        System.out.println("Maximum Day Of Month : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

    }

}
