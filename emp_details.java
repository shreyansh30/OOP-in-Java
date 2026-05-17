interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;
    private final java.util.Scanner scanner;

    public Head() {
        scanner = new java.util.Scanner(System.in);
    }

    @Override
    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter employee name: ");
        empName = scanner.nextLine();
    }

    @Override
    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter department name: ");
        deptName = scanner.nextLine();
    }

    public void printDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

public class emp_details {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.printDetails();
    }
}