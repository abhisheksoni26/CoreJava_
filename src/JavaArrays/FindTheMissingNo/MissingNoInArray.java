package JavaArrays.FindTheMissingNo;

import java.util.Scanner;

public class MissingNoInArray {

    public static int missingNo(int[] arr) {

        int num = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != num) {

                return num;

            } else {
                num++;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};

        int ans = missingNo(arr);

        if (ans == -1) {
            System.out.println("No missing number was found!");
        } else {
            System.out.println("The missing number is  : " + ans);
        }

        // Absolute value Like : |-X| == X
        System.out.println(Math.abs(-2));

        // Signum , It provides us the sign of the arguement
        System.out.println(Math.signum(-2));
        System.out.println(Math.signum(2));
        System.out.println(Math.signum(0));

    }

}
