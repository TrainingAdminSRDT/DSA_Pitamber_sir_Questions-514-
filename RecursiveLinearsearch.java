public class RecursiveLinearsearch {
    public static int linearsearch(int[] arr,int idx, int target){
        if(idx==arr.length)return 0;

        return linearsearch(arr,idx+1,target);
    }

    static void main() {
        int[] arr={1,4,5,67,8};
        linearsearch(arr, arr.length, 4);
    }

}
