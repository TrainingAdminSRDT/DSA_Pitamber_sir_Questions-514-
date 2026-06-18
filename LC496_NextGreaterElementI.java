import java.util.*;

class LC496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }

    public static void main(String[] args) {
        LC496_NextGreaterElementI sol = new LC496_NextGreaterElementI();
        int[] res = sol.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
        for (int r : res) System.out.print(r + " ");
    }
}