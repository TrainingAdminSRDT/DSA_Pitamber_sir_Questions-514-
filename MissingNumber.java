public class MissingNumber {

    static int findMissing(int[] arr) {

        int n = arr.length + 1;

        int totalSum = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return totalSum - sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int missing = findMissing(arr);

        System.out.println("Missing Number: " + missing);
    }
}