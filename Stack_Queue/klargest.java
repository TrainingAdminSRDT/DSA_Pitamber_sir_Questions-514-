//question215
import java.util.PriorityQueue;
public class klargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        klargest obj = new klargest();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = obj.findKthLargest(nums, k);
        System.out.println("Kth Largest: " + result);
    }
}