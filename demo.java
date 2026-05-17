import java.util.*;
class box{
	double height,width,length;
	void volume(){
		double vol = height*width*length;
		System.out.println("The volume of the box is : "+vol);
	}
}
public class demo{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
        box b = new box();
        System.out.println("Enter length, width and height of box: ");
        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();
		b.volume();
	}
}

	