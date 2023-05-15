package JavaRegex;

import java.util.regex.Pattern;

//Create a regular expression that accepts alphanumeric characters only.
//        Its length must be six characters long only
public class Example1 {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aS7Wb8"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "yash26"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "ya3fe"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "yash2001"));

    }
}
