package JavaString.Problems;

public class ConcatenationTest {

    public static String ConcatWithString(){

        String t = "Core";

        for (int i = 0; i<10000 ; i++){

            t += " Java Abhishek Soni, Shubham Diwakar";

        }
        return t;

    }

    public static StringBuffer ConcatWithStringBuffer(){

        StringBuffer t = new StringBuffer("Core");

        for (int i = 0; i<10000 ; i++){

            t.append(" Java Abhishek Soni, Shubham Diwakar");

        }
        return t;

    }

    public static StringBuilder ConcatWithStringBuilder(){

        StringBuilder t = new StringBuilder("Core");

        for (int i = 0; i<10000 ; i++){

            t.append(" Java Abhishek Soni, Shubham Diwakar");

        }
        return t;

    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        ConcatWithString();

        System.out.println("Time Taken : " + (System.currentTimeMillis() - startTime) + "ms");

        ConcatWithStringBuffer();

        startTime = System.currentTimeMillis();

        System.out.println("Time Taken : " + (System.currentTimeMillis() - startTime) + "ms");

        ConcatWithStringBuilder();

        startTime = System.currentTimeMillis();

        System.out.println("Time Taken : " + (System.currentTimeMillis() - startTime) + "ms");

    }

}
