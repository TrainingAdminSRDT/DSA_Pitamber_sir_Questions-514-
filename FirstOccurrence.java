class FirstOccurrence {
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 2, 9, 2};
        int key = 2;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("First Occurrence Index = " + i);
                break;
            }
        }
    }
}