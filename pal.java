import java.util.Scanner;
public class pal{    
	public static void main(String[] args)   
	{  
    int reverse = 0;
    try (Scanner obj = new Scanner(System.in)) {
		System.out.println("Enter a number ");
		int n = obj.nextInt();
		int n1 = n;
		while(n != 0)   
			{  
				int r = n % 10;  
				reverse = reverse * 10 + r;  
				n = n/10;  
			}  
		if (reverse == n1)
			System.out.println("The number " + reverse + " is palindrome");  
		else 
			System.out.println("The number " + reverse + " is not palindrome");
	} 
	}  
}  