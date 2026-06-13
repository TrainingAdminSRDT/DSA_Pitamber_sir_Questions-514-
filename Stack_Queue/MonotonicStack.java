import java.util.Stack;
import java.util.Arrays;
public class MonotonicStack {
    public int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        MonotonicStack obj = new MonotonicStack();
        int[] nums = {4, 5, 2, 10, 8};
        int[] result = obj.nextGreaterElement(nums);
        System.out.println(Arrays.toString(result));
    }
}