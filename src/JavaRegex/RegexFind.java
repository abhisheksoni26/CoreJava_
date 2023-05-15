package JavaRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true){

            System.out.println("Enter Regex Pattern : ");
            Pattern pt = Pattern.compile(s.nextLine());

            System.out.println("Enter Text : ");
            Matcher mt = pt.matcher(s.nextLine());

            boolean found = false;

            while (mt.find()){
                System.out.println("I found " + mt.group() + "at starting index " + mt.start() + " and ending at " + mt.end());
                found=true;
            }
            if (!found){
                System.out.println("No match found");
            }

        }




    }

}
