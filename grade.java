import java.util.*;
public class grade{
	public static void main (String args[]){
		try (Scanner obj = new Scanner (System.in)) {
			System.out.println("Enter your Marks");
			int g = obj.nextInt();
			System.out.print("Your Grade is ");
			if (g>90)
				System.out.println("O");
			else if (g>80 && g<=90)
				System.out.println("E");
			else if (g>70 && g<=80)
				System.out.println("A");
			else if (g>60 && g<=70)
				System.out.println("B");
			else if (g>50 && g<=60)
				System.out.println("C");
			else
				System.out.println("F");
		}
	}
}
		
		
		