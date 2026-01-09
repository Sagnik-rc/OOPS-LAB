//A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
//Input: Enter dimensions
//Output: Display the cost of plastic
import java.util.Scanner;

class Plastic2D {
    double length;
    double breadth;
    double cost = 40;

    void getData(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * cost;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    double cost = 60;

    void getData(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * cost;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for 2D Sheet or 2 for 3D Box:");
        int choice = sc.nextInt();

        if (choice == 1) {
            Plastic2D sheet = new Plastic2D();

            System.out.println("Enter length and breadth:");
            double l = sc.nextDouble();
            double b = sc.nextDouble();

            sheet.getData(l, b);
            System.out.println("Cost of plastic sheet: Rs " + sheet.calculateCost());

        } else if (choice == 2) {
            Plastic3D box = new Plastic3D();

            System.out.println("Enter length, breadth and height:");
            double l = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();

            box.getData(l, b, h);
            System.out.println("Cost of plastic box: Rs " + box.calculateCost());

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
