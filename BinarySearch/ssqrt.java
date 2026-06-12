//question69
public class ssqrt {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long start = 1;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) end; 
    }

    public static void main(String[] args) {
        ssqrt obj = new ssqrt();
        int x = 8;
        int result = obj.mySqrt(x);
        System.out.println("Square Root: " + result);
    }
}