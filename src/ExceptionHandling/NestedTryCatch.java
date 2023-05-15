package ExceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {

        try {

            try {
                int i = 100 / 0;
            } catch (ArithmeticException e1) {
                System.out.println(e1);
            }

            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e2) {
                System.out.println(e2);
            }

            try {
                int[] arr = new int[5];
                arr[4] = 12;
                System.out.println(arr[4]);
            } catch (ArrayIndexOutOfBoundsException e3) {
                System.out.println(e3);
            }

            System.out.println("Main Try Block");

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Rest of the code...");

    }
}
