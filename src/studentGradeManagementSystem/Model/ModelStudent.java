package studentGradeManagementSystem.Model;

public class ModelStudent {
    private String name;
    private int age;
    private int grade;

    public ModelStudent(String initialName, int initialAge, int initialGrade) {
        this.name = initialName;
        this.age = initialAge;
        this.grade = initialGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Grade: " + getGrade() + ".");
    }
}
