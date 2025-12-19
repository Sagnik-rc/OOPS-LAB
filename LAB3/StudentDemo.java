//Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.print("Enter Roll No: ");
            s[i].roll = sc.nextInt();

            sc.nextLine(); // clear buffer
            System.out.print("Enter Name: ");
            s[i].name = sc.nextLine();

            System.out.print("Enter CGPA: ");
            s[i].cgpa = sc.nextDouble();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }

        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);
        sc.close();
    }
}
