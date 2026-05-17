import java.util.*;
class Student {
    int roll;
    String name;
    double cgpa;
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCGPA() {
        return cgpa;
    }
    public String getName() {
        return name;
    }
    public void displayDetails() {
        System.out.println("Roll No: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}
public class demo3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
		for (int i = 0; i < n;i++){
			System.out.println("Enter the Roll number for Student "+(i+1));
			int roll = sc.nextInt();
			System.out.println("Enter the Name for Student "+(i+1));
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter the CGPA for Student "+(i+1));
			double cgpa = sc.nextDouble();
			students[i] = new Student(roll, name, cgpa);
		}
		System.out.println("Details of students:");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
        }
		System.out.println();
		double lowestCGPA = students[0].getCGPA();
        String lowestCGPAStudent = students[0].getName();
        for (int i = 1; i < n; i++) {
            if (students[i].getCGPA() < lowestCGPA) {
                lowestCGPA = students[i].getCGPA();
                lowestCGPAStudent = students[i].getName();
            }
        }
        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudent);
    }
}

		