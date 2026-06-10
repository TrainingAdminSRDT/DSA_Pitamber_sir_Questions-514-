import java.util.PriorityQueue;

class Kth_largest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    // Main method to run the program
    public static void main(String[] args) {
        Kth_largest obj = new Kth_largest();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = obj.findKthLargest(nums, k);
        System.out.println(k + "th largest element is: " + result);
    }
}
