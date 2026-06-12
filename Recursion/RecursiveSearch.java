public class RecursiveSearch {
    public int search(int[] arr, int n, int target) {
        if (n == 0) return -1;
        if (arr[n - 1] == target) return n - 1;
        return search(arr, n - 1, target);
    }

    public static void main(String[] args) {
        RecursiveSearch obj = new RecursiveSearch();
        int[] arr = {10, 20, 30, 40};
        int target = 30;
        System.out.println("Index: " + obj.search(arr, arr.length, target));
    }
}