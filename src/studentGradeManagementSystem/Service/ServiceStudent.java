package studentGradeManagementSystem.Service;
import required.Util;
import studentGradeManagementSystem.Model.ModelStudent;


public class ServiceStudent {

    ModelStudent[] modelStudent = new ModelStudent[100];
    int count = 0;

    Util input = new Util();

    public void addStudent() {
        input.systemOutPrint("\nPlease, Enter your student's information");

        String name = input.requiredText("Student's name:");
        int age = input.requiredNumber("Student's age:");
        int grade = input.requiredNumber("Student's grade:");

        modelStudent[count] = new ModelStudent(name, age, grade);
        count++;
        System.out.println("\nStudent information added successfully!!!");
        input.showReturnToMenuText();
    }

    public void showStudents() {
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                modelStudent[i].displayInfo();
            }
            input.showReturnToMenuText();
        } else {
            System.err.println("\nThe list is empty");
        }
    }

    public void searchStudent() {
        String searchName = input.requiredText("\nPlease, enter the student information you need: ");

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (modelStudent[i] == null) {
                break;
            }
            if (modelStudent[i].getName().equalsIgnoreCase(searchName)) {
                modelStudent[i].displayInfo();
                found = true;
                System.err.println("Student found");
                input.showReturnToMenuText();
                break;
            }
        }

        if (!found) {
            System.err.println("\nStudent not found");
        }
    }

    public void deleteStudent() {
        String deletedStudent = input.requiredText("\nWhich do you want to delete student");

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (modelStudent[i].getName().equalsIgnoreCase(deletedStudent)) {
                modelStudent[i] = modelStudent[count - 1];
                modelStudent[count - 1] = null;
                count--;
                found = true;
                System.err.println("\nStudent delete");
                input.showReturnToMenuText();
                break;
            }
        }

        if (!found) {
            System.err.println("\nStudent not found");
        }
    }

    public void calculateAverage() {
        if (count == 0) {
            System.err.println("\nHesablamaq üçün tələbə yoxdur");
            return;
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += modelStudent[i].getGrade();
        }
        double avg = sum / count;
        input.systemOutPrint("\nAverage grade: " + avg);
        input.showReturnToMenuText();
    }
}
