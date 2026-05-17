import java.util.*;
class Area {
    void area(double r) {
        System.out.println("Area of circle is: " + (3.14 * r * r));
    }
    void area(double b, double h) {
        System.out.println("Area of triangle is: " + (0.5 * b * h));
    }
    void area(float s1) {
        System.out.println("Area of square is: " + (s1 * s1));
    }
}
@SuppressWarnings("unused")
class demo5 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            Area a = new Area();
            System.out.println("Enter radius of circle: ");
            double r = sc.nextDouble();
            a.area(r);
            System.out.println("Enter base and height of triangle: ");
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            a.area(b, h);
            System.out.println("Enter side of square: ");
            float s = sc.nextFloat();
            a.area(s);
        }
    }
}