package JavaString.Problems;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String input = s.next();

        for (int i = input.length()-1; i>=0 ; i--){

            System.out.print(input.charAt(i));

        }

        // OR

        StringBuilder sb = new StringBuilder(s.next());

        sb.reverse();

        System.out.println(sb);


    }
}
