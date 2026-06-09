class Solution {
public:
    bool isPowerOfTwo(int n) {
        if n <=0{
            return false;
        }
        else{
            return (n & (n-1)) == 0;
        }
    }
};



// Explantion:
/*
Agar 0 and less than 0 hota hai then its zero
0^2 = 0 aise 
and power of two positive value hoti


(n & (n-1)) == 0
binary nikaalta n ki aur n-1 ka bitwise AND karta hai

eg: n = 4 (100 in binary)
n-1 = 3 (011 in binary)
100 & 011 = 000 (0 in decimal)

if zero its power of two otherwise not 
*/