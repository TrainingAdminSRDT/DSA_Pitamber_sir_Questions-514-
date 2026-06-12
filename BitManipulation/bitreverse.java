//question190
public class bitreverse {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;          
            result |= (n & 1);    
            n >>>= 1;            
        }
        return result;
    }

    public static void main(String[] args) {
        bitreverse obj = new bitreverse();
        int n = 43261596; 
        int result = obj.reverseBits(n);
        System.out.println("Reversed Bits: " + result);
    }
}