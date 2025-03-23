class Solution {
    public int maxScore(int[] nums) {
        
        Arrays.sort(nums);
        int count=0;
        long prefix = 0;
        for(int i=nums.length-1; i>=0; i--){
            prefix += nums[i];
            if(prefix > 0)
                count++;
            else
                break;
        }
        return count;
    }
}
/*
Time complexity - O(n logn)
Space complexity - O(1)
*/
    