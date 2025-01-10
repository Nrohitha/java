package Arrays;

public class SmallerNumbers {
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 8, 12, 1};
        int currentNumber = 10;

        int count = countSmallerNumbers(numbers, currentNumber);
        System.out.println("Numbers smaller than " + currentNumber + ": " + count);
    }

    public static int countSmallerNumbers(int[] numbers, int currentNumber) {
        int count = 0;
        
        for (int num : numbers) {
            if (num < currentNumber) {
                count++;
            }
        }
        
        return count;
    }


}
