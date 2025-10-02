import libraryBookManagementSystem.MainBook;
import studentGrademanagementSystem.MainStudent;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which use system?");
        System.out.println("1 - libraryBookManagementSystem ");
        System.out.println("2 - studentGrademanagementSystem ");
        int choice = sc.nextInt();

        if (choice == 1) {
            new MainBook();
        } else if (choice == 2) {
            new MainStudent();
        } else {
            System.out.println("Please, right enter your choice. Try again!");
        }
    }
}
