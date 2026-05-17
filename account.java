import java.util.*;
class Account{
	int acc_no;
	double balance;
	void input(){
            try (Scanner sc = new Scanner (System.in)) {
                System.out.print("Enter the Account Number : ");
                acc_no = sc.nextInt();
                System.out.print("Enter the Account Balance : ");
                balance = sc.nextDouble();
            }
	}
	void disp(){
		System.out.println("Account Number : " + acc_no + "\nAccount Balance : " + balance);
	}
}
class Person extends Account{
	String name;
	int ad_no;
        @Override
	void input(){
		super.input();
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Enter the Name : ");
			name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter Aadhaar Card Number : ");
			ad_no = sc.nextInt();
		}
	}
        @Override
	void disp(){
		super.disp();
		System.out.println("Name : " + name + "\nAadhaar Number : " + ad_no);
	}
}
public class account{
	public static void main (String args[]){
		Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.input();
        p2.input();
        p3.input();
        p1.disp();
        p2.disp();
        p3.disp();
    }
}
		
