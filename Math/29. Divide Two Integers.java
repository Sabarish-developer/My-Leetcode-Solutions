class Solution {
    public int divide(int dividend, int divisor) {
        
        // Approach 2 : Bitwise Left shifting
        //Handling Edge cases
        if(divisor == dividend) return 1;
        if(divisor==1) return dividend;
        if(dividend==Integer.MIN_VALUE && divisor==-1) return Integer.MAX_VALUE;

        boolean isNegative = !((dividend>0 && divisor>0) || (dividend<0 && divisor<0));
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);
        int quotient = 0;
        
        while(dividendLong >= divisorLong){
            long temp = divisorLong;
            long multiple = 1;
            while(dividendLong >= (temp<<1)){
                multiple = multiple<<1;
                temp = temp<<1;
            }
            quotient += multiple;
            dividendLong -= temp;
        }
        return isNegative ? -quotient : quotient;

        //Approach 1 : Simple Math - Repeated subtraction
        /*
        // Handling simple math edge cases
        if(dividend == divisor)
            return 1;
        if(divisor==1 && dividend!=Integer.MIN_VALUE)
            return dividend;
        // Handling Edge cases for Integer Overflow
        if(divisor == Integer.MIN_VALUE)
            return 0;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1) return Integer.MAX_VALUE;
            if(divisor == 1) return Integer.MIN_VALUE;
            long dividendLong = Math.abs((long)(dividend));
            boolean divisorIsNegative = divisor<0;
            divisor = Math.abs(divisor);
            int quotient = 0;
            while(dividendLong >= divisor){
                dividendLong -= divisor;
                quotient++;
            }
            return divisorIsNegative ? quotient : -quotient;
        }
        // Solving by repeated subtraction
        boolean dividendIsNegative = dividend<0;
        boolean divisorIsNegative = divisor<0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }
        if( (!dividendIsNegative && !divisorIsNegative) || (dividendIsNegative && divisorIsNegative) )
            return quotient;
        else
            return -quotient;
        */
    }
}
/*
Approach 1 : 
    Time complexity - O(n) 
    Space complexity - O(1)

Approach 2 : 
    Time complexity - O(log n)
    Space complexity - O(1)
*/