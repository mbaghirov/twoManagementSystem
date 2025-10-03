package studentGradeManagementSystem;

import java.util.Scanner;

public class MainStudent {
    public void run() {
        Scanner sc = new Scanner(System.in);
        Student studentOne = new Student();
        int choice = 0;

        while (choice != 4){
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Student add");
            System.out.println("2 - Print student information");
            System.out.println("3 - Show grade");
            System.out.println("4 - Exit program");
            System.out.println("Please, enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    studentOne.addStudent();
                    break;
                case 2:
                    studentOne.printStudent();
                    break;
                case 3:
                    studentOne.showGread();
                    break;
                case 4:
                    System.out.println("Program exit");
                    break;
                default:{
                    System.out.println("Please, right enter your choice. Try again");
                }

            }
        }


    }

}