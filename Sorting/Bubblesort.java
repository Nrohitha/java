package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[]arr={5,4,1,3,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubbleSort(int[]arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;

                }
            }
            if(!swapped){
                break;
            }
            

        }
    }
    

}
