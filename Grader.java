
import java.util.Scanner;

public class Grader {
    public void gradeStudent() {
        int score = 0;
        char grade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        score = sc.nextInt();


        if (score > 100 || score < 0) {
            System.out.println("Invalid mark enetered!");
        } 
        else if (score >= 90) {
            grade = 'A';
            System.out.println("Grade: " + grade);
        } 
        else if (score >= 80) {
            grade = 'B';
            System.out.println("Grade: " + grade);
        } 
        else if (score >= 70) {
            grade = 'C';
            System.out.println("Grade: " + grade);
        } 
        else if (score >= 60) {
            grade = 'D';
            System.out.println("Grade: " + grade);
        } 
        else if (score >= 50) {
            grade = 'E';
            System.out.println("Grade: " + grade);
        } 
        else {
            grade = 'F';
            System.out.println("Grade: " + grade);
        }
          
    }

    public static void main(String[] args) {
        new Grader().gradeStudent();
        
    }
}
