public class RecursiveArraysum {
    
    public static int findSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + findSum(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 2};
        int totalSum = findSum(numbers, 0);
        System.out.println("The sum of the array elements is: " + totalSum);
    }
}