//Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth. Use default constructor to initialize the value of the data member to zero and parameterized constructor to initialize the value of data member according to the user input.

class RectangleArea {
    double length, breadth;

    // Default constructor
    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args) {

        RectangleArea r1 = new RectangleArea();
        r1.area();

        RectangleArea r2 = new RectangleArea(5, 4);
        r2.area();
    }
}
