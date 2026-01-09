//Write a program in Java having three classes Apple, Banana and Cherry. Class Banana and Cherry are inherited from class Apple and each class have their own member function show() . Using Dynamic Method Dispatch concept display all the show() method of each class.
//Input: Mention show function of each class.
//Output: Display show function of each class accordingly.

import java.util.Scanner;

class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Apple ref;

        System.out.println("Enter your choice:");
        System.out.println("1. Apple show()");
        System.out.println("2. Banana show()");
        System.out.println("3. Cherry show()");
        System.out.print("Choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                ref = new Apple();
                ref.show();
                break;

            case 2:
                ref = new Banana();
                ref.show();
                break;

            case 3:
                ref = new Cherry();
                ref.show();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
