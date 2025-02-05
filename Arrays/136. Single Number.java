class Solution {
    public int singleNumber(int[] nums) {
        
        int number = 0;
        for(int i: nums){
            number ^= i;
        }
        return number;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/