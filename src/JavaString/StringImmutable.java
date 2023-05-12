package JavaString;

public class StringImmutable {

    public static void main(String[] args) {

        String s1 = "Abhishek";
        String s5 = "Abhishek"; // this refers to the same instance of the above value in String constant pool

        String s2 = new String("Abhishek");

        String s3 = "Shubham";
        String s4 = "ABHISHEK";

        // Way 1 - "equals()" ->

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println();

        //Way 2 - "==" ->
        System.out.println(s1==s2); // False, because new keyword refers to instance created in non pool
        System.out.println(s1==s5); // True, Because it refers to same instance
        System.out.println(s1==s3); // False, They aren't same
        System.out.println(s1==s4); // False, Uppercase

        System.out.println();

        //Way 3 - "CompareTo()" ->
        System.out.println(s1.compareTo(s2)); // Gives 0 because 'Abhishek' is same as 'Abhishek'
        System.out.println(s1.compareTo(s3)); // Gives -18 because 'A' is lower than 'S' 18 times






    }
}
