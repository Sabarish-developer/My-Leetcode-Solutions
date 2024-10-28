class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int middle = 0;
        while(start <= end){
            middle = (start+end)/2;
            System.out.println(middle);
            if(nums[middle] == target)
                return middle;

            if(target > nums[middle])
                start = middle+1;
            else
                end = middle-1;
        }
        if(target > nums[middle])
            return middle+1;
        return middle;
    }
}

/*
Time complexity - O(log n)
Space complexity - O(1)

For finding insert position : 
    -> If target is greater than middle element, then it will be in next index.
    -> If target is less than middle element, it will be in middle element position not middle-1 position.
*/