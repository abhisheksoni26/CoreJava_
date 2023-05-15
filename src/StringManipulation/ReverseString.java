package StringManipulation;

public class ReverseString {
    public static void main(String[] args) {

        //Way 1->
        String s = "Abhishek";

        char[] charS = s.toCharArray();
        String rev ="";

        for (int i = charS.length-1; i>=0; i-- ){
            rev += charS[i];
        }
        System.out.println(rev);



        //Way2 ->

        StringBuilder stringBuilder = new StringBuilder("WhoIsThis");

        stringBuilder.reverse();

        System.out.println(stringBuilder);

    }
}
