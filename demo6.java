import java.util.*;
class Rectangle {
    double length;
    double breadth;
    Rectangle() {
        length = 0;
        breadth = 0;
    }
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Area of rectangle is: " + (length * breadth));
    }
}
@SuppressWarnings("unused")
class demo6 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle r1 = new Rectangle();
            r1.area();
            System.out.println("Enter length and breadth of rectangle: ");
            double l = sc.nextInt();
            double b = sc.nextInt();
            Rectangle r2 = new Rectangle(l, b);
            r2.area();
        }
    }
}