import java.util.*;
class Subtract {
    void subtract(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }
    void subtract(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }
    void subtract(int a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }
    void subtract(float a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
    }
}
public class demo4{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		Subtract s = new Subtract();
		System.out.println("Enter 2 Integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		s.subtract(a,b);
		System.out.println("Enter 2 Double Values");
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		s.subtract(c,d);
		System.out.println("Enter 1 Integer and 1 Double");
		int e = sc.nextInt();
		double f = sc.nextDouble();
		s.subtract(e,f);
		System.out.println("Enter 1 Float and 1 Integer");
		float g = sc.nextFloat();
		int h = sc.nextInt();
		s.subtract(g,h);
	}
}

		
	