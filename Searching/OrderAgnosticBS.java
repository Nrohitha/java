package Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -3, 2, 3, 4, 15, 16, 18, 22, 45};
        int target = 45;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end]; // Check if the array is sorted in ascending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1; // If target is smaller, move towards the left half
                } else {
                    start = mid + 1; // If target is larger, move towards the right half
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1; // If target is larger, move towards the left half
                } else {
                    start = mid + 1; // If target is smaller, move towards the right half
                }
            }
        }

        return -1; // Target not found
    }
}

        
    

    
    
          
        
        

    


