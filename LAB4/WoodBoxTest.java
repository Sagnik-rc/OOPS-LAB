//Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick) where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
//Input: Enter the dimensions
//Output: Display the dimensions accordingly

import java.util.Scanner;

class Plate {
    int length, width;

    Plate(int l, int w) {
        length = l;
        width = w;
        System.out.println("Plate Constructor Called");
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Box extends Plate {
    int height;

    Box(int l, int w, int h) {
        super(l, w);   // Calls Plate constructor
        height = h;
        System.out.println("Box Constructor Called");
        System.out.println("Height: " + height);
    }
}

class WoodBox extends Box {
    int thick;

    WoodBox(int l, int w, int h, int t) {
        super(l, w, h);   // Calls Box constructor
        thick = t;
        System.out.println("WoodBox Constructor Called");
        System.out.println("Thickness: " + thick);
    }
}


public class WoodBoxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimensions:");
        System.out.print("Length: ");
        int l = sc.nextInt();

        System.out.print("Width: ");
        int w = sc.nextInt();

        System.out.print("Height: ");
        int h = sc.nextInt();

        System.out.print("Thickness: ");
        int t = sc.nextInt();

        System.out.println("\n--- Object Creation Starts ---\n");
        WoodBox wb = new WoodBox(l, w, h, t);
    }
}
