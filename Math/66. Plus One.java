class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)

Note : 
    -> No need to create new array with plus 1 size in all cases
    -> If a value is < 9 just increment and return 
    -> Or else equate to 0 - no need to have carry since it is a loop
        it will take care
    -> If entire loop completes without returning that mean all array is 0
        Eg, 1000
*/