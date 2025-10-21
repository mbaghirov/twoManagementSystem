package libraryBookManagementSystem.Service;
import required.Util;
import libraryBookManagementSystem.Model.ModelBook;

public class ServiceBook {

    private ModelBook[] modelBook = new ModelBook[100];
    private Util input = new Util();
    private int count = 0;


    public void inputBook() {
        System.out.println("Please, add your book;");

        String title = input.requiredText("Enter book's title:");
        String author = input.requiredText("Enter book's author:");
        int year = input.requiredNumber("Enter year the book was published");

        System.out.println("\nBook information added successfully!!!");

        modelBook[count] = new ModelBook(title, author, year);
        count++;
        input.showReturnToMenuText();
    }

    public void printBook() {
        for (int i = 0; i < count; i++) {
            System.out.println("Book #" + (i + 1));
            System.out.println("Title: " + modelBook[i].getTitle());
            System.out.println("Author: " + modelBook[i].getAuthor());
            System.out.println("Year: " + modelBook[i].getYear());
            if (i < count - 1) {
                System.out.println("---------------------------");
            }

        }
        input.showReturnToMenuText();
    }

    public void checkOrNew() {
        String title = input.requiredText("Enter book title to check:");
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (modelBook[i].getTitle().equalsIgnoreCase(title)) {
                found = true;
                int year = modelBook[i].getYear();
                if (year < 2015) {
                    System.out.println(title + "\" is an old edition (before 2015).");
                } else {
                    System.out.println(title + "\" is a newly published book (2015 or later).");
                }
                break;
            }
        } if (!found) System.err.println("Book not found!");
        input.showReturnToMenuText();

    }

}
