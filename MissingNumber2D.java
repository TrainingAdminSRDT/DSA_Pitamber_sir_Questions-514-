public class MissingNumber2D {

    public static int findMissing(int[][] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                actualSum += arr[i][j];
            }
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 9, 0}
        };

        int n = 9;

        int missing = findMissing(arr, n);

        System.out.println("Missing Number: " + missing);
    }
}
