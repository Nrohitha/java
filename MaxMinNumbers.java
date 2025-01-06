import java.util.Scanner;
public class MaxMinNumbers {
    public static void printMax(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("Maximum number is"+max);

    }
    public static void printMin(int a, int b, int c){
    int min=a;
    if(b<min){
        min=b;
    }
    if(c<min){
        min=c;
    }
    System.out.println("Minimum number is:"+min);
}


 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    int num1=sc.nextInt();
    System.out.println("Enter the second number:");
    int num2=sc.nextInt();
    System.out.println("Enter the third number:");
    int num3=sc.nextInt();
    printMax(num1,num2,num3);
    printMin(num1,num2,num3);
 }
}

