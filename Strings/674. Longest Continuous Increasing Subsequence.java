class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int longest = 1;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] > nums[i-1])
                count++;
            else
                count = 1;

            if(count > longest)
                longest = count;
        }
        return longest;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/