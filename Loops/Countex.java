package Loops;

public class Countex {
    public static void main(String[] args) {
    int n=67668;
    int Count=0;
    while(n>0){
        int rem=n%10;
        if(rem==6){
            Count++;
        }
        n=n/10;
    }
    System.out.println(Count);
    }
}

