class Solution {
    public int majorityElement(int[] nums) {
        
        //Intuition

        /*
        Arrays.sort(nums);
        int index = nums.length / 2;
        return nums[index];
        */

        //Boyer-Moore Voting Algorithm

        int candidate = nums[0];
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == candidate)
                count++;
            else
                count--;
            if(count == 0){
                candidate = nums[i];
                count = 1;
            }
        }
        return candidate;

    }
}

/*
Approach 1 : Intuition 

    -> If element appears more than n/2 times then it is always the middle element after sorting.
    -> If we consider space used by sorting algorithm then it is O(n) since it requires some temporary storage or else it is O(1).
    Time complexity - O(n logn)
    Space complexity - O(1) or O(n)

                       
Approach 2 : Boyer-Moore Voting Algorithm

    ->Suitable for large arrays when an element occurs more than n/2 times.

    Initialize:
    Set the first element as the candidate and initialize its count to 1.

    Iterate Through Array:
    For each element:
    If it matches the candidate, increment count.
    If it doesn’t match, decrement count.
    If count reaches 0, choose the current element as the new candidate and reset count to 1.

    Return the Candidate:
    After one pass, the candidate is the majority element.

    Time complexity - O(n)
    Spcae complexity - O(1)

*/