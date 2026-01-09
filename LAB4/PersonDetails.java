import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        sc.nextLine();     // consume newline
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLong();

        super.input(sc);
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp();     // call Account display
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons:\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
            System.out.println();
        }

        System.out.println("----- Displaying Details of Three Persons -----\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i].disp();
            System.out.println();
        }

        sc.close();
    }
}
