class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int total = (n*(n+1))/2;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        return total-sum;

        /*
        Approach 2 : Binary Search

        int left = 0, right = nums.length;
        Arrays.sort(nums);
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > mid)
                right = mid;
            else
                left = mid+1;
        }
        return left;
        */
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)

For sorted array binary search works well, 
Time complexity - (log n)
*/