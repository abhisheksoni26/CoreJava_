package JavaString;

public class WaysOfStringDeclaration {

    public static void main(String[] args) {
        //Way 1 ->
        String s1 = "By String Literal";

        //Way 2 ->
        char [] ch= {'s', 't', 'r', 'i', 'n', 'g'};
        String s2 = new String(ch); // Converting char Array to String :)

        //Way 3 ->
        String s3 = new String("By New Keyword");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }

}
