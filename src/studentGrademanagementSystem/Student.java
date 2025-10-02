package studentGrademanagementSystem;

import java.util.Scanner;

public class Student {
    String name;
    String subject;
    int score;

    public Scanner sc = new Scanner(System.in);

    /// Bu method istifadeciden telebe melumatlarini daxil etmeyi temin etsin
    void addStudent() {
        System.out.println("Please, enter student's information; ");

        System.out.println("Student name: ");
        String inputName = sc.nextLine();
        name = inputName;

        System.out.println("Subject name: ");
        String inputPSubject = sc.nextLine();
        subject = inputPSubject;

        System.out.println("Student score: ");
        int inputScore = sc.nextInt();
        score = inputScore;

        if (inputName.equals(name) && inputPSubject.equals(subject) && inputScore == score) {
            System.out.println("Dear our student, " + inputName + " your welcome");
        } else {
            System.out.println("Please enter the information correctly!");
        }
    }

    /// Bu method istifadeciden telebe melumatlarini ekranda cap etdirsin
    void printStudent() {
        System.out.println("Student's name: " + name);
        System.out.println("Subject's name: " + subject);
        System.out.println("Student's score: " + score);
    }

    /// Bu method bal esasinda telebenin qiymetini (A, B, C, D, F) hesablayib gostersin
    void showGread() {
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("Student score grade: " + grade);
    }




}


