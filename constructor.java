import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Dimmensions of Plate : "+length+" "+width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width); 
        this.height = height;
        System.out.println("Dimmensions of Box : "+length+" "+width+" "+height);
    }
}

class WoodenBox extends Box {
    double thickness;

    WoodenBox(double length, double width, double height, double thickness) {
        super(length, width, height); 
        this.thickness = thickness;
        System.out.println("Dimmensions of Box : "+length+" "+width+" "+height+" "+thickness);
    }
}

public class constructor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the dimmensions : ");
            int length = sc.nextInt();
            int width = sc.nextInt();
            int height = sc.nextInt();
            int thickness = sc.nextInt();
            @SuppressWarnings("unused")
            WoodenBox wb = new WoodenBox(length,width,height,thickness);
        }
    }
}