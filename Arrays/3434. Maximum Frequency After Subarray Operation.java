class Solution {
    public int maxFrequency(int[] nums, int k) {

        if(nums.length == 1)
                return 1;
        
        int n = nums.length;
        int freq[] = new int[51];
        for(int i: nums)
            freq[i]++;
        int kFreq = freq[k];
        int currentSum = 0, currentMax = 0, maxSum = 0;
        for(int i=1; i<51; i++){
            if(i==k || freq[i]==0)
                continue;
            currentSum = 0; currentMax = 0;
            for(int j=0; j<n; j++){
                if(nums[j] == k)
                    currentSum--;
                if(nums[j] == i)
                    currentSum++;
                currentSum = currentSum<0 ? 0 : currentSum;
                currentMax = currentSum>currentMax ? currentSum : currentMax;
            }
            maxSum = currentMax>maxSum ? currentMax : maxSum;
        }
        return maxSum + kFreq;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)

Note : 
    -> Modified Kadane's Algorithm
*/