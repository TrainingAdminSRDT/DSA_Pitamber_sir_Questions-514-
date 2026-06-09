class Solution {
public:
    bool isPowerOfThree(int n) {

        if ( n <= 0){
            return false ;

        }
        else return (1162261467 % n) == 0;
        
    }
};



/*
agar n zero ya negative hua to ofcourse power of 3 nahi hoga to false return karenge

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).

<-                         ---------                                 ->
And For next condition :
Highest 3^x ( x being the power) that can be like 3^19 = 1162261467

So :
27 % 3 == 0 Right Remainder will 0.
yaaa
81 % 27 == 0 Remaider 0

So If the If Check krna hai for n :
1162261467 % n == 0 Remainder 0 if n is the power of 3 otherwise it will not be 0 and hence false return hoga

*/