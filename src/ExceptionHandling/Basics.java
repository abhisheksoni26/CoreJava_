package ExceptionHandling;

public class Basics {

    static String b;

    public static void main(String[] args) {

        //NumberFormatException ->
        b = "123";
        try {
            String a = "abc";

            int i = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            int i = Integer.parseInt(b);
            System.out.println(b);
        }

        //ArrayIndexOutOfBoundsException ->
        try {
            int[] arr = new int[5];

            arr[10] = 40;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


        //NullPointerException ->
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        //ParentClassException ->
        try {
            int a = 100 / 0;
        } catch (Exception e) {
            System.out.println("Can't divide ny zero");
        }


        System.out.println("rest of the code...");

    }
}
