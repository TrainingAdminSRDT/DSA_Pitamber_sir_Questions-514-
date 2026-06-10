public class FirstLastOccurrence {

    static int firstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,4,4,6,7};

        System.out.println(firstOccurrence(arr,4));
        System.out.println(lastOccurrence(arr,4));
    }
}