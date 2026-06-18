import java.util.*;

class LC739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        LC739_DailyTemperatures sol = new LC739_DailyTemperatures();
        int[] res = sol.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        for (int r : res) System.out.print(r + " ");
    }
}