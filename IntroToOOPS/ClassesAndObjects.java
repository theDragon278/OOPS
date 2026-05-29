package IntroToOOPS;

class StudentDetails {
    String name;
    String rollnumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollnumber(String rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public String getRollnumber() {
        return rollnumber;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        StudentDetails stud1 = new StudentDetails();
        stud1.setName("Ambarish Behera");
        stud1.setRollnumber("2305278");

        System.out.println("Name: " + stud1.getName());
        System.out.println("Rollnumber: " + stud1.getRollnumber());
    }
}
