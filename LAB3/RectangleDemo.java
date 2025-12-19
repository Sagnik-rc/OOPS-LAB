//Write a program in Java to create a class Rectangle having data members length and breadth and three methods called read, calculate and display to read the values of length and breadth, calculate the area and perimeter of the rectangle and display the result respectively.
import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void calculate() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    void display() {
        calculate();
    }
}

class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.display();
    }
}
