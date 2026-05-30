package CorePrinciplesOfOOPS;

class EmployeeDetails {
    private String name;
    private int id;

    EmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

class Manager extends EmployeeDetails {
    private int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Engineer extends EmployeeDetails {
    private String specialization;

    Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Ambarish Behera",
                101,
                12);

        Engineer engineer = new Engineer(
                "Aditya Kumar Rajpoot",
                102,
                "Software Development");

        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println();

        System.out.println("Engineer Details:");
        engineer.displayDetails();
    }
}
