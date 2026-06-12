//question191
public class bit1 {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1); 
            n >>>= 1;         
        }
        return count;
    }

    public static void main(String[] args) {
        bit1 obj = new bit1();
        int n = 11; 
        int result = obj.hammingWeight(n);
        System.out.println("Number of 1 bits: " + result);
    }
}