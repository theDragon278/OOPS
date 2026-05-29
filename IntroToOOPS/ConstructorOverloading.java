package IntroToOOPS;

class EmployeeDetail {
    public String employeeName;
    public int salary;

    public EmployeeDetail() {
        this.employeeName = "Unknown";
        this.salary = 0;
    }

    public EmployeeDetail(String employeeName) {
        this.employeeName = employeeName;
        this.salary = 0;
    }

    public EmployeeDetail(String employeeName, int salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        EmployeeDetail emp1 = new EmployeeDetail();
        System.out.println("Details of Employee 1 (Default Constructor):");
        emp1.displayDetails();

        System.out.println();

        EmployeeDetail emp2 = new EmployeeDetail("Raj");
        System.out.println("Details of Employee 2 (One Parameter Constructor):");
        emp2.displayDetails();

        System.out.println();

        EmployeeDetail emp3 = new EmployeeDetail("Rahul", 5000);
        System.out.println("Details of Employee 3 (Two Parameters Constructor):");
        emp3.displayDetails();
    }
}
