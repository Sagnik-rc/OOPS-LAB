//Program to check a user entered number is palindrome or not

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;     // store original number
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;            // extract last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10;                  // remove last digit
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
