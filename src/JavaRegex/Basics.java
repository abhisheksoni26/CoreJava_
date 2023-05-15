package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basics {

    public static void main(String[] args) {

        String a = ".b";
        String b = "an";

        //Way 1 ->
        Pattern pt = Pattern.compile(a);
        Matcher mt = pt.matcher(b);

        boolean res = mt.matches();

        System.out.println(res);


        //Way 2 ->
        boolean res1 = Pattern.compile(a).matcher(b).matches();

        System.out.println(res1);

        //Way 3 ->
        boolean res2 = Pattern.matches(a, b);
        System.out.println(res2);



    }
}
