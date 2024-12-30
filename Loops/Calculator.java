package Loops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("Enter operator");
            char op=in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("Enter two numbers=");
                int num1=in.nextInt();
                int num2=in.nextInt();
                int ans=0;
                if(op=='+'){
                    ans =num1+num2; 
                }
                if(op=='-'){
                ans =num1-num2;
                }
                if(op=='*'){
                    ans =num1*num2;
                }
                if(op=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                }
                if(op=='%'){
                    ans=num1%num2;
                }
                System.out.println(ans);

            }else if(op=='X'||op=='x'){

                break;
                
            }
            else{
                System.out.println("Invalid operation!!");
            }
            
        }
        
    }

}
