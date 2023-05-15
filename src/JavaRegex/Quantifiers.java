package JavaRegex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {

        System.out.println("? - Quantifier");

        System.out.println(Pattern.matches("[abc]?", "ab"));
        System.out.println(Pattern.matches("[abc]?", "aaaa"));
        System.out.println(Pattern.matches("[abc]?", "abbbbc"));
        System.out.println(Pattern.matches("[abc]?", "a")); // Occurs once or not at all
        System.out.println(Pattern.matches("[abc]?", "b")); // Occurs once or not at all
        System.out.println(Pattern.matches("[abc]?", "c")); // Occurs once or not at all


        System.out.println();
        System.out.println("+ - Quantifier");

        System.out.println(Pattern.matches("[abc]+", "aaa"));
        System.out.println(Pattern.matches("[abc]+", "aabbbccc"));
        System.out.println(Pattern.matches("[abc]+", "aab"));
        System.out.println(Pattern.matches("[abc]+", "a"));
        System.out.println(Pattern.matches("[abc]+", "ab"));
        System.out.println(Pattern.matches("[abc]+", "abz"));


        System.out.println();
        System.out.println("* - Quantifier");

        System.out.println(Pattern.matches("[abc]*", "aaa"));
        System.out.println(Pattern.matches("[abc]*", "aabbbccc"));
        System.out.println(Pattern.matches("[abc]*", "aab"));
        System.out.println(Pattern.matches("[abc]*", "")); //Occurs zero or more times


    }
}
