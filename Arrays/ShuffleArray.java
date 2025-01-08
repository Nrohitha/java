package Arrays;
import java.util.*;

public class ShuffleArray {
    public static void shuffleArray(int[]array){
        List<Integer>list=new ArrayList<>();
        for(int num:array){
            list.add(num);
        }
        Collections.shuffle(list);
        for(int i=0;i<array.length;i++){
            array[i]=list.get(i);
        }
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        System.out.println("Original array:"+Arrays.toString(array));
        shuffleArray(array);
        System.out.println("Shuffled array:"+Arrays.toString(array));
    }

}
