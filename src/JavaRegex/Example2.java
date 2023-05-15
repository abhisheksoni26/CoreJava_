package JavaRegex;

import java.util.regex.Pattern;

/*Create a regular expression that accepts 10 digit numeric characters
 starting with 7, 8 or 9 only.*/
public class Example2 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8887846617"));

    }

}
