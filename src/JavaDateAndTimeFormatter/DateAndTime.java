package JavaDateAndTimeFormatter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDateTime myDate = LocalDateTime.now();
        LocalDateTime DateZoneWise = LocalDateTime.now(ZoneId.of("US/Eastern"));

        System.out.println("Before Results (Unformatted) INDIA : " + myDate);


        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDateAndTime = myDate.format(format);

        System.out.println( "After Results (Formatted) INDIA: "+formattedDateAndTime);

        System.out.println( "After Results (Formatted) New York : "+ DateZoneWise.format(format));

    }

}
