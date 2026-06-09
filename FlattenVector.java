import java.util.*;

public class FlattenVector {

    static List<Integer> flatten(List<List<Integer>> vec) {

        List<Integer> result = new ArrayList<>();

        for (List<Integer> row : vec) {
            for (int num : row) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> vec = new ArrayList<>();

        vec.add(Arrays.asList(1, 2));
        vec.add(Arrays.asList(3));
        vec.add(Arrays.asList(4, 5, 6));

        List<Integer> flat = flatten(vec);

        System.out.print("Flattened Vector: ");
        for (int x : flat) {
            System.out.print(x + " ");
        }
    }
}