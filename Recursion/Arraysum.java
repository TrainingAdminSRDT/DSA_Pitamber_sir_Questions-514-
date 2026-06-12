public class Arraysum {
    public int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public static void main(String[] args) {
        Arraysum obj = new Arraysum();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Array Sum: " + obj.sum(arr, arr.length));
    }
}