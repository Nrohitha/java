import java.util.Scanner;
public class Product {
    public static int calculateProduct(int a, int b){
        return a*b;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1=sc.nextInt();
    System.out.println("Enter the second number:");
    int num2=sc.nextInt();
    int product=calculateProduct(num1,num2);
    System.out.println("The product of two numbers is"+product);
}

}
