package libraryBookManagementSystem;

public class Book {
    String title;
    String author;
    int year;

    Util input = new Util();

    /// Istifadeci kitab melumatlarini daxil etmeyi temin etsin
    void inputBook() {
        System.out.println("Please, add your book;");

        title = input.requiredText("Enter book's title:");

        author = input.requiredText("Enter's book author: ");

        year = input.requiredNumber("Enter, year the book was published");
    }



    /// Kitab haqqinda melumatlari ekranda gostersin
    void printBook() {
        input.systemOutPrint("Book's " + title);
        input.systemOutPrint("Book's author " + author);
        input.systemOutPrint("Book's year" + year);
    }

    /// Kitabin kohne veya yeni oldugunu gostersin
    void checkOrNew() {
        if (year < 2015) {
            input.requiredText("This book is an old edition");
        } else if (year > 2015) {
            input.requiredNumber("This book is newly published");
        }
    }

}
