package JavaString.Problems;

import java.util.Scanner;

public class CreatingUsernameWithEmail {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String email = s.next();

        String Username = "";

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                break;
            } else {
                Username += email.charAt(i);
            }

        }
        System.out.println("Username : " + Username);

    }
}
