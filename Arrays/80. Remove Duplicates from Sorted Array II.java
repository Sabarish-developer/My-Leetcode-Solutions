class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 2;
        int length = nums.length;
        if(length < 3)
            return length;

        for(int i=2; i<length; i++){
            if(nums[i]==nums[index-2])
                continue;
            nums[index++] = nums[i];
        }
        return index;
    }
}
/*
Time complexity - O(n)
Space complexity - O(1)
*/