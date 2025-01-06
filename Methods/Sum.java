package Methods;
import java.util.Scanner;
public class Sum {
    public static void printSum(int a, int b){
        int sum =a+b;
        System.out.println("The sum of two numbers is"+sum);
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        printSum(num1,num2);

    }

}
