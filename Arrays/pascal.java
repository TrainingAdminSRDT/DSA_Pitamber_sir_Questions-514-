// question 118
import java.util.ArrayList;
import java.util.List;

public class pascal {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int c = 1; c < r; c++) {
                List<Integer> prevRow = result.get(r - 1);
                row.add(prevRow.get(c - 1) + prevRow.get(c));
            }

            if (r > 0)
                row.add(1);

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        pascal obj = new pascal();

        int numRows = 5;
        List<List<Integer>> triangle = obj.generate(numRows);

        System.out.println("Pascal's Triangle:");
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}