class Solution {
    public int reverse(int x) {

        boolean isNegative = x<0 ? true : false;
        if(isNegative)
            x = -x;
        
        if(x==0 || x==Integer.MIN_VALUE)
            return 0;
        

        int digits = ((int)(Math.log10(x)))+1;
        if(digits==10 && (x%10 > 2)) // Checking > than 2 because Integer min or max starts with 2.
            return 0;

        int rev = 0;
        int prev = 0;
        for(int i=0; i<digits-1; i++){
            int rem = x%10;
            rev += rem;
            rev *= 10;
            if(rev < prev) // Refer 3rd point in note
                return 0;
            x /= 10;
            prev = rev;
        }
        rev += x%10;
        if(isNegative)
            return -rev;
        return rev;
    }
}
/*
Time complexity - O(log(x))
Space complexity - O(1)

Note : 
    -> abs() - can't convert Integer.MIN_VALUE or greater
    -> log10() - returns double type
    -> If value exceeds int limit either value overflows or stores any -ve value , no error will be thrown.

Edge case : 
    1. x=1534236469 r=0
    2. x=-2147483412 r=-2147483412
    3. x=-2147483648 r=0
*/
