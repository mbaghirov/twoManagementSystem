package libraryBookManagementSystem;

import java.util.Scanner;

 public class Util {
    Scanner sc = new Scanner(System.in);

    int requiredNumber (String text){
        System.out.println(text);
        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }

    String requiredText(String text){
        System.out.println(text);
        return sc.nextLine();
    }

    void systemOutPrint (String text){
        System.out.println(text);
    }
}
