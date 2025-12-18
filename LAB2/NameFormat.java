//Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name

import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Formatted Name: " + lastName + " " + firstName);

        sc.close();
    }
}
