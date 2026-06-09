class Leetcode231 {
    public boolean isPowerOfTwo(int n) {
        int i;
        double x;
        if(n==1){
            return true;
        }
        if(n%2==0){
            for(i=1;i<=31;i++){
                x=Math.pow(2,i);
                if(n==x){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Leetcode231 leetcode231 = new Leetcode231();
        System.out.println(leetcode231.isPowerOfTwo(16));
    }
}