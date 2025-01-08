package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="Rohitha";
        char target='h';
        System.out.println(search(name,target));

    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
               return true; 
            }
        }
        return false;

    }

}
