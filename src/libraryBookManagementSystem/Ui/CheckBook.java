package libraryBookManagementSystem.Ui;
import libraryBookManagementSystem.Service.ServiceBook;
import java.util.Scanner;

public class CheckBook {
    Scanner sc = new Scanner(System.in);
    ServiceBook serviceBook = new ServiceBook();

    int choice = 0;

    public void check() {
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

        switch (choice) {
            case 1 -> serviceBook.inputBook();
            case 2 -> serviceBook.printBook();
            case 3 -> serviceBook.checkOrNew();
            case 4 -> {
                System.err.println("\nProgram exit");
                System.exit(0);
            }
            default -> System.err.println("\nPlease, correct choice!\n");
        }
    }

}