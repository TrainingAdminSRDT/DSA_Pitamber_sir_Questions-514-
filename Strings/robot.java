//question657
public class robot {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        robot obj = new robot();
        String moves = "UDLR";
        boolean result = obj.judgeCircle(moves);
        System.out.println("Returns to Origin: " + result);
    }
}