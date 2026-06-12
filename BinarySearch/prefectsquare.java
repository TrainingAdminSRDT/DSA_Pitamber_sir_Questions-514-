//questionn367
public class prefectsquare {
    public boolean isPerfectSquare(int num) {
        if (num < 1) {
            return false;
        }
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        prefectsquare obj = new prefectsquare();
        int num = 16;
        boolean result = obj.isPerfectSquare(num);
        System.out.println("Is Perfect Square: " + result);
    }
}