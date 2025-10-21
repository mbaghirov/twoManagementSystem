package required;

import java.util.Scanner;

 public class Util {
     Scanner sc = new Scanner(System.in);

     public int requiredNumber(String text) {
         System.out.println(text);
         int i = sc.nextInt();
         sc.nextLine();
         return i;
     }

     public String requiredText(String text) {
         System.out.println(text);
         return sc.nextLine();
     }

     public void systemOutPrint(String text) {
         System.out.println(text);
     }


     public void showReturnToMenuText() {
         this.requiredText("\nPlease, press Enter to return to menu");
     }
 }
