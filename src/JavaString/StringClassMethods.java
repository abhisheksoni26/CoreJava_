package JavaString;

public class StringClassMethods {

    static void UpperCase(String s){
        System.out.println(s.toUpperCase());
    }

    static void LowerCase(String s){
        System.out.println(s.toLowerCase());
    }

    static void trim(String s){
        System.out.println(s.trim());
    }



    public static void main(String[] args) {

        String s = "  Abhishek Soni  ";

        UpperCase(s);
        LowerCase(s);

        trim(s); // Trims the before and after white spaces


        //startsWith() and endsWith() ->

        String a = "VasyERP";

        System.out.println(a.startsWith("Va"));
        System.out.println(a.endsWith("RP"));

    }

}
