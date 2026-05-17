import java.util.Scanner;

class Employee {
    protected int empid;
    private final String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra; 
    }

    public int getEmpId() {
        return empid;
    }

    public String getEname() {
        return ename;
    }
}

class Sales extends Employee {

    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double totalEarnings) {
        return 0.05 * totalEarnings; 
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the employee id and employee name: ");
            int empid = scanner.nextInt();
            String ename = scanner.next();
            System.out.print("Enter the basic salary: ");
            double basic = scanner.nextDouble();
            Sales salesPerson = new Sales(empid, ename);
            double totalEarnings = salesPerson.earnings(basic);
            System.out.println("The emp id of the employee is " + salesPerson.getEmpId());
            System.out.println("The total earning is " + totalEarnings);
        }
    }
}