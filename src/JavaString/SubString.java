package JavaString;

public class SubString {

    public static void main(String[] args) {

        String str = "Hello Abhishek";

        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));


        //Split ->
        String str2 = "Jane,21,Employed,Software Engineer";

        String[] split = str2.split(",");

        for (String s : split){
            System.out.println(s);
        }

    }

}
