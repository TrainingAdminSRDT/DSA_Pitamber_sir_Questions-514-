import java.util.PriorityQueue;

public class LargestElement {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("Invalid input: nums must not be empty and k must be between 1 and array length");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        Integer result = minHeap.peek();
        return (result != null) ? result : -1;
    }
}
