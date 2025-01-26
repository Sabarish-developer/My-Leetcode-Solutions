class Solution {
    public int countPartitions(int[] nums) {

        if(nums.length == 0)
                return 0;
        if(nums.length == 0){
            if(nums[0]%2 == 0) return 1;
            else return 0;
        }
        int n = nums.length;
        int count = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1; i<n; i++)
            prefix[i] = prefix[i-1] + nums[i];
        for(int i=0; i<n-1; i++){
            int leftSum = prefix[i];
            int rightSum = prefix[n-1]-leftSum;
            int diff = rightSum - leftSum;
            diff = diff<0 ? -diff : diff;
            if(diff%2 == 0)
                    count++;
        }
        return count;
    }
}
/*
Time complexity - O(n)
Space complexity - O(n)
*/