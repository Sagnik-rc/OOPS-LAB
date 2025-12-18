//Write a program to print the week day for the given day no. of the current month using switch case statement.

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number of the current month: ");
        int day = sc.nextInt();

        int weekDay = day % 7;

        // If remainder is 0, it means it's the 7th day (Sunday)
        if (weekDay == 0) {
            weekDay = 7;
        }

        switch (weekDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        sc.close();
    }
}

