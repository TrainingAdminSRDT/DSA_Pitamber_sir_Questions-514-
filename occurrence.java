public class occurrence{
    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 40};
        int target = 40;

        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        if (firstIndex != -1) {
            System.out.println("First occurrence found at index: " + firstIndex);
        } else {
            System.out.println("Element not found");
        }

        if (lastIndex != -1) {
            System.out.println("Last occurrence found at index: " + lastIndex);
        } else {
            System.out.println("Element not found");
        }
    }
}