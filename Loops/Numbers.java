package Loops;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sumNegative =0;
        int sumPositiveEven=0;
        int sumpositiveodd=0;
        System.out.println("Enter numbers:");
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num<0){
                sumNegative +=num;
            }
            else if(num > 0){
                if(num%2==0){
                    sumPositiveEven +=num;
                }
                else{
                    sumpositiveodd += num;
                }
            }
        }
        System.out.println("Sum of Negative numbers:"+sumNegative);
        System.out.println("Sum of positive even numbers:"+sumPositiveEven);
        System.out.println("Sum of positive odd numbers:"+sumpositiveodd);
        
    } 
}  