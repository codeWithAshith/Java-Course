package i.oops.K_UserInput;

import java.util.Scanner;

public class K_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String fName = sc.next();
        System.out.println("Enter your Last Name");
        String lName = sc.next();
        System.out.println("Enter your Phone Number");
        long phone = sc.nextLong();
        System.out.println("Welcome: " + fName + " " + lName);
        System.out.println("Your phone Number is: " + phone);
        sc.close();
    }
}
