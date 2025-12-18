//Write a program to print your name, roll no, section and branch in separate lines.

import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        System.out.print("Enter your section: ");
        String section = sc.nextLine();

        System.out.print("Enter your branch: ");
        String branch = sc.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);

        sc.close();
    }
}
