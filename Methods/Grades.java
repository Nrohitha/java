package Methods;
import java.util.Scanner;

public class Grades {
    public static String getGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else if (marks <= 40) {
            return "Fail";
        } else {
            return "Invalid marks"; 
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        
        String grade = getGrade(marks);

        
        System.out.println("Your grade is: " + grade);

        
        
    }


}
