package Arrays;
import java.util.*;

public class Concatenatearrays {
    public static int[] concatenateArrays(int[]array1, int[] array2){
        List<Integer>list=new ArrayList<>();
        for(int i:array1)list.add(i);
        for(int i:array2)list.add(i);
        int[]result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;

    }
        public static void main(String[] args) {
            int[]array1={7,8,9};
            int[]array2={4,5,6};
            System.out.println("Array 1:"+Arrays.toString(array1));
            System.out.println("Array2:"+Arrays.toString(array2));
            int[]concatenated=concatenateArrays(array1,array2);
            System.out.println("Concatenated array:"+Arrays.toString(concatenated));
        }
    

}
