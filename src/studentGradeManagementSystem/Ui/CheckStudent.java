package studentGradeManagementSystem.Ui;
import required.Util;
import studentGradeManagementSystem.Service.ServiceStudent;
import java.util.Scanner;

public class CheckStudent {
    public void check() {

        Scanner sc = new Scanner(System.in);
        ServiceStudent serviceStudent = new ServiceStudent();
        Util input = new Util();

        int choice = 0;

        input.systemOutPrint(
                """
                        \n===== Student Management System =====
                        1. Student add
                        2. Show students
                        3. Search student
                        4. Delete student
                        5. Calculate average
                        0. Exit
                        """);

        input.systemOutPrint("Please, select the menu item");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> serviceStudent.addStudent();
            case 2 -> serviceStudent.showStudents();
            case 3 -> serviceStudent.searchStudent();
            case 4 -> serviceStudent.deleteStudent();
            case 5 -> serviceStudent.calculateAverage();
            case 0 -> {
                System.err.println("\nProgram exit");
                System.exit(0);
            }
            default -> System.err.println("\nPlease, correct choice!\n");
        }

    }
}