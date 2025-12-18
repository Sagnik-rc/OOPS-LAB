//Write a program to print the corresponding grade for the given mark using if..else statement in Java.
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        String grade;

        if (mark >= 90) {
            grade = "A";
        } else if (mark >= 80) {
            grade = "B";
        } else if (mark >= 70) {
            grade = "C";
        } else if (mark >= 60) {
            grade = "D";
        } else if (mark >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Your Grade: " + grade);

        sc.close();
    }
}
