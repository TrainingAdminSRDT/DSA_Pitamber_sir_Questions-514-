import java.util.Arrays;
public class transposee {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        transposee obj = new transposee();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}};
        int[][] result = obj.transpose(matrix);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}