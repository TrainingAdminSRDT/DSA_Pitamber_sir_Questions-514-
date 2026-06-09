class Leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int j,i;
        double x;
        int arr[]=new int[2];
        for (i=0;i<nums.length-1;i++){
            for(j=i+1;j<nums.length;j++){
                //x=nums[i]+nums[j];
                
                if(nums[i] + nums[j] == target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
