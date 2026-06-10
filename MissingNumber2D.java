class MissingNumber2D {

    public static void main(String[] args) {

        int[][] arr={
            {1,2},
            {4,5}
        };

        int n=5;

        int sum=n*(n+1)/2;

            int actual = 0;

            // use enhanced for-loops to iterate over the 2D array
            for (int[] row : arr) {
                for (int val : row) {
                    actual += val;
                }
            }

        System.out.println(sum-actual);
    }
}