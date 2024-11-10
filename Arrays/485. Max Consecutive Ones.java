class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                count++;
            else
                count = 0;
            max = count>max ? count : max;
        }
        return max;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/