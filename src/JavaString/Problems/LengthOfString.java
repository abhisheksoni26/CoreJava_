package JavaString.Problems;

import java.util.Scanner;

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
public class LengthOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of String Array : ");
        int size = sc.nextInt();


        String [] arr = new String[size];

        int totalLength = 0;

        System.out.println("Enter the Sentence : ");

        for (int i = 0; i<arr.length;i++){

            arr[i] = sc.next();
            totalLength += arr[i].length();

        }
        System.out.println("Total Length is : " + totalLength);

    }

}
