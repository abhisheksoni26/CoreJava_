package JavaString.Problems;

//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’/'E' in the original string with letter ‘i’/'I'.

import java.util.Scanner;

public class ReplacingLetterInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String result = "";

        for (int i = 0; i<s.length(); i++){

            if (s.charAt(i) == 'e'){

                result +=   'i';

            }
            else if (s.charAt(i) == 'E'){

                result += 'I';

            }
            else {

                result += s.charAt(i);

            }

        }

        System.out.println(result);

    }

}
