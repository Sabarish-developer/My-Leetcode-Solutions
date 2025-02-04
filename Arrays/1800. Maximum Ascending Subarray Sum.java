class Solution {
    public int maxAscendingSum(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int currentSum = nums[0], maxSum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= nums[i-1]){
                currentSum = 0;
            }
            currentSum += nums[i];
            maxSum = maxSum<currentSum ? currentSum : maxSum;
        }
        return maxSum;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/