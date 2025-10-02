package libraryBookManagementSystem;

import java.awt.*;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book bookOne = new Book();

        int choice = 0;

        while(choice != 4){
            System.out.println("""
                    \n--- MENU --- 
                    1 - Book add
                    2 - Print book information
                    3 - Show old/new status
                    4 - Exit program
                    Please, enter choice: 
                    """);
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    bookOne.inputBook();
                    break;
                case 2:
                    bookOne.printBook();
                    break;
                case 3:
                    bookOne.checkOrNew();
                    break;
                case 4:
                    System.out.println("Exit program");
                    break;
                default:{
                    System.out.println("Please, right enter your choice. Try again");
                }
            }
        }

    }
}
