import java.util.Scanner;

class TwoD {
    double length;
    double width;
    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double Area() {
        return length * width;
    }
    double cost() {
        return Area() * 40;
    }
}

class ThreeD extends TwoD{
    double height;
    ThreeD(double length,double width,double height) {
        super(length, width);
        this.height = height;
    }
    double volume(){
        return length*width*height;
    }
    double getcost(){
        return volume()*60;
    }
}

public class costcalc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the dimensions for 2D sheet (length and width): ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            TwoD sheet = new TwoD(length, width);
            System.out.println("Cost of 2D sheet: Rs " + sheet.cost());
            
            System.out.println("Enter the dimensions for 3D box (length, width, and height): ");
            length = scanner.nextDouble();
            width = scanner.nextDouble();
            double height = scanner.nextDouble();
            ThreeD box = new ThreeD(length, width, height);
            System.out.println("Cost of 3D box: Rs " + box.getcost());
        }
    }
}