package CorePrinciplesOfOOPS;

import java.util.*;

class Employee {
    public String name;
    protected int employeeId;
    private double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;

        if (salary < 0) {
            this.salary = 0.0;
            System.out.println("Invalid salary. Salary set to 0");
        } else {
            this.salary = salary;
        }
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0.0;
            System.out.println("Invalid salary. Salary set to 0");
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter employeeId: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee emp1 = new Employee(name, id, salary);
        emp1.displayDetails();

        sc.close();
    }
}