package IntroToOOPS;

class Employee {
    public String employeeName;
    public int salary;

    public Employee(String name, int salary) {
        this.employeeName = name;
        this.salary = salary;
    }

    public Employee(Employee employee) {
        this(employee.employeeName, employee.salary);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Employee obj = new Employee("Raj", 10000);

        Employee objCopy = new Employee(obj);

        System.out.println("Name of the copied employee: " + objCopy.employeeName);
        System.out.println("Salary of the copied employee: " + objCopy.salary);
    }
}
