package Basics;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("A \nB \nC \nD");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'A':{
                System.out.println("A for Apple.....");
                break;
            }
            case 'B':{
                System.out.println("B for ball....");
                break;
            }
            case 'C':{
                System.out.println("C for cat....");
                break;
            }
            case 'D':{
                System.out.println("D for dog....");
                break;
            }
            default:{
                System.out.println("Invalid option");
            }
        }

    }

}
