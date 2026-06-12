//question6
public class zigzag {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;
        for (char ch : s.toCharArray()) {
            rows[currentRow].append(ch);
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        zigzag obj = new zigzag();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = obj.convert(s, numRows);
        System.out.println("Zigzag: " + result);
    }
}