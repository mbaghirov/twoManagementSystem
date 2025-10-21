import libraryBookManagementSystem.MainBook;
import studentGradeManagementSystem.MainStudent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWhich use system?\n");
        System.out.println("1 - Library Book Management System ");
        System.out.println("2 - Student Grade Management System\n ");
        int choice = sc.nextInt();
        sc.nextLine();


        switch (choice) {
            case 1:
                MainBook project_1 = new MainBook();
                project_1.mainBook();
                break;
            case 2:
                MainStudent project_2 = new MainStudent();
                project_2.mainStudent();
                break;
            default:
                System.err.println("Please, right enter your choice. Try again!");
        }

    }
}
