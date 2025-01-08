package LinearSearch;
public class SearchInArray {
    public static void main(String[] args) {
        int[]nums={45,67,34,1,23,89,40};
        int target=67;
        int ans= linearSearch(nums,target);
        System.out.println(ans);
    }
        static int linearSearch(int[]arr,int target){
            if(arr.length==0){
                return -1;
            }
            for(int i=0;i<arr.length;i++){
                int element=arr[i];
                if(element==target){
                    return i;
                }
            }
            return -1;
        }


    


}
