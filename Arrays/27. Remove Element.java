class Solution {
    public int removeElement(int[] nums, int val) {
        
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val)
                nums[++index] = nums[i];
        }
        return ++index;
        //Returning ++index because they asked number of elements
    }
}

/*
Time complexity - O(n)
Space complexity - O(1)

*/