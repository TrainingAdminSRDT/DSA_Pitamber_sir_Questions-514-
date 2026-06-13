public class MissingNumber {
    
    public static int findMissingNumber(int[] arr, int maxNum) {
        // 1. Calculate expected sum
        int expectedSum = (maxNum * (maxNum + 1)) / 2;
        
        // 2. Calculate actual sum
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // 3. Difference is the missing element
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Array missing the number 75 out of 1 to 121
        int maxNum = 121;
        int[] testArray = new int[120]; 
        int index = 0;
        for (int i = 1; i <= maxNum; i++) {
            if (i != 75) {
                testArray[index++] = i;
            }
        }

        System.out.println("Missing number: " + findMissingNumber(testArray, maxNum)); // Output: 75
    }
}