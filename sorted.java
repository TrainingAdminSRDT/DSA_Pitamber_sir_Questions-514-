public class sorted{
    public static boolean check(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2}; // true
        int[] arr2 = {2, 1, 3, 4};    // false

        System.out.println(check(arr1));
        System.out.println(check(arr2));
    }
}