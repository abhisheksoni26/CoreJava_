package JavaString;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatanation {

    public static void main(String[] args) {


        String s1 = new String("Hello");
        String s2 = new String(" World");


        //Way 1-> "String Format"
        String format = String.format("%s%s", s1, s2);

        //Way 2 -> "String Builder"
        StringBuilder sa = new StringBuilder("Hello ");
        StringBuilder s = sa.append("World");
        System.out.println(s);

        //Way 3 -> "Join()"
        String join = String.join("", s1, s2);
        System.out.println(format);
        System.out.println(join);

        //Way 4 -> "Joiner()"
        StringJoiner joiner = new StringJoiner(", ");

        joiner.add("Hello");
        joiner.add("Abhishek");
        joiner.add("Shubham");

        System.out.println(joiner.toString());


        //way 5 -> "Collectors.joining()"
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array

        String collector = liststr.stream().collect(Collectors.joining(", "));

        System.out.println(collector);


    }

}
