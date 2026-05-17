interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Salary {
    protected double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double earnings() {
        return basicSalary + (basicSalary * 0.8) + (basicSalary * 0.15);
    }

    @Override
    public double deductions() {
        return basicSalary * 0.12;
    }
    @Override
    public abstract double bonus();
}

class Substaff extends Manager {
    public Substaff(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double bonus() {
        return basicSalary * 0.5;
    }
}

public class emp_earnings {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            Substaff substaff = new Substaff(basicSalary);

            System.out.println("\nSubstaff Details:");
            System.out.println("Earnings: " + substaff.earnings());
            System.out.println("Deductions: " + substaff.deductions());
            System.out.println("Bonus: " + substaff.bonus());
        }
    }
}