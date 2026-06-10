<<<<<<< HEAD
class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr={1,2,2,2,3,4};
        int target=2;

        int first=-1,last=-1;

        for(int i=0;i<arr.length;i++) {

            if(arr[i]==target) {

                if(first==-1)
                    first=i;

                last=i;
            }
        }

        System.out.println("First = "+first);
        System.out.println("Last = "+last);
    }
}
=======
import java.util.*;

public class FirstLastOccurrence {

    static int firstOcc(int[] arr, int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int lastOcc(int[] arr, int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int first = firstOcc(arr, target);
        int last = lastOcc(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
>>>>>>> 7d3da34bae6c3ec29f611818a3779c6fd722a49b
