class Solution {
    public int findPeakElement(int[] nums) {
      
        //Approach 1 : Intuition
        /*
        if(nums.length == 1)
            return 0;
        if(nums.length == 2)
            return nums[0]>nums[1]?0:1;

        int index = nums.length/2;
        while(index>0 && index<nums.length-1){
            if(nums[index]>nums[index+1] && nums[index]>nums[index-1])
                return index;
            else{
                if(nums[index-1] > nums[index+1])
                    index--;
                else
                    index++;
            }
        }
        return index;
        */

        //Approach 2 : Binary Search

        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[mid+1])
                right = mid;
            else
                left = mid+1;
        }
        return left;

    }
}
/*

Approach 1 :
    Time complexity - O(n)
    Space complexity - O(1)

Approach 2 :
    Time complexity - O(log n)
    Space complexity - O(1)

Note : 
    Finding middle element = left + ((right-left)/2)
    This is because to avoid overflow for large numbers, Suppose left = 2,000,000,000 and right = 2,000,000,000.Since 4,000,000,000 exceeds the maximum value of a signed 32-bit integer, it causes an overflow.

Key idea of 2nd approach : 
    Think of Walking in Hills and Valleys : 
        Imagine you’re standing on a path through a series of hills and valleys. You want to find any peak, but you don’t need to climb every hill. All you need is a single high point that’s higher than its neighbors.

Steps of the Thought Process:

Start in the Middle:

Imagine standing in the middle of the path and looking to your left and right.
If the slope on either side goes upward, you know there’s a peak somewhere in that direction. It’s like seeing a path up a hill—you know if you walk in that direction, you’ll reach the top without needing to explore every point.

Move Toward the Higher Side:

If the slope goes up to your right, walk right because you’re more likely to hit a peak.
If the slope goes up to your left, walk left. You don’t need to know exactly where the peak is; you just know it’s “up” in that direction.

Stop When You Reach a Peak:

Eventually, you’ll reach a point where both sides either level off or go down. This is your peak because there’s no higher point directly next to you.

*/